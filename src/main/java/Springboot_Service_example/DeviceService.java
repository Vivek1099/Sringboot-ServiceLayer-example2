package Springboot_Service_example;

import java.util.List;
import java.util.Optional;

public interface DeviceService
{
    public Device addDevice(Device device);
    public List<Device> listdevice();
    public Optional<Device> getById(int deviceid);
    public List<Device> getBymodelname(String modelname);
    public Device updateDevice(int deviceid, Device device);
    public String deleteDevice(int deviceid);
}
