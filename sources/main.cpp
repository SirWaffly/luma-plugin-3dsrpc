#include <3ds.h>
#include <CTRPluginFramework.hpp>

namespace CTRPluginFramework
{
    void PatchProcess(FwkSettings &settings) {}

    void OnExitProcess(void) {}

    int main(void)
    {

        // Read the config file
        File file;
        File::Open(file, "/luma/plugins/luma-plugin-3dsrpc.conf", File::READ);

        // Parse the config file on a string
        std::string config;
        config.resize(file.GetSize());
        file.Read(&config[0], config.size());

        // Get the IP and parse it on a string
        size_t ipStart = config.find("ip=") + 3;
        size_t ipEnd = config.find_first_of("\r\n", ipStart);
        std::string ip = config.substr(ipStart, ipEnd - ipStart);

        // Get the Port and parse it on a string
        size_t portStart = config.find("port=") + 5;
        size_t portEnd   = config.find_first_of("\r\n", portStart);
        std::string port = config.substr(portStart, portEnd - portStart);

        // Obtain the title ID and process it to be in Hexadecimal
        u64 titleID = 0;
        titleID = Process::GetTitleID();
        std::string titleIDHex = Utils::Format("%016llX", titleID);

        // Information on screen
        OSD::Notify("luma-plugin-3dsrpc settings:");
        OSD::Notify("IP: " + ip); // TEST notification with the parsed IP
        OSD::Notify("Port: " + port); // TEST notification with the parsed Port
        OSD::Notify("Title ID: " + titleIDHex); // TEST notification about title ID (in hex)

        httpcInit(0);
        std::string url = "http://" + ip + ":" + port + "/?titleid=" + titleIDHex;

        // Every 5 seconds
        while(true)
        {

            httpcContext request;
            httpcOpenContext(&request, HTTPC_METHOD_GET, url.c_str(), 0);
            httpcBeginRequest(&request);

            Sleep(Milliseconds(5000));

            httpcCloseContext(&request);

        }

        return 0;

    }

}
