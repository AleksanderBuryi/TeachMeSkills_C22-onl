package task1;

public class IpAddress {
    private String ipAddress;

    public IpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public IpAddress(IpAddress address) {
        this.ipAddress = address.ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
