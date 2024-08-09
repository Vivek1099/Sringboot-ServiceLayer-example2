package Springboot_Service_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService
{
    @Autowired
    DeviceRepository drepo;

    public Device addDevice(Device device)
    {
        drepo.save(device);
        return device;
    }

    public List<Device> listdevice()
    {
        return drepo.findAll();
    }

    @Override
    public Optional<Device> getById(int deviceid) {
        return drepo.findById(deviceid);
    }

   @Override
   public List<Device> getBymodelname(String modelname)
   {
	   return drepo.findBymodelname(modelname);
   }
   
   @Override
   public Device updateDevice(int deviceid, Device device)
   {
	   Device d = drepo.findById(deviceid).get();
	   d.setModelname(device.getModelname());
	   d.setCompanyname(device.getCompanyname());
	   d.setDevicetype(device.getDevicetype());
	   d.setPrice(device.getPrice());
	   return drepo.save(d);
   }
   
   @Override
   public String deleteDevice(int deviceid)
   {
	   drepo.deleteById(deviceid);
	   return "Data deleted";
   }
}
