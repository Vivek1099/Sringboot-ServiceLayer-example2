package Springboot_Service_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DeviceController
{
    @Autowired
    DeviceServiceImpl dserv;
    
    
    @RequestMapping("/test")
    public String test()
    {
        return "Service test";
    }

    @RequestMapping("/save")
    public Device savedata(@RequestBody Device device)
    {
        return dserv.addDevice(device);
    }

    @RequestMapping("/show")
    public List<Device> showall()
    {
        return dserv.listdevice();
    }

    @RequestMapping("/{deviceid}")
    public Optional<Device> dataid(@PathVariable int deviceid)
    {
        return dserv.getById(deviceid);
    }

    @RequestMapping("/name/{modelname}")
    public List<Device> ByName(@PathVariable String modelname)
    {
    	return dserv.getBymodelname(modelname);
    }
    
    @RequestMapping("/update/{deviceid}")
    public Device UpdateById(int deviceid, Device device)
    {
    	return dserv.updateDevice(deviceid, device);
    }
    
    @RequestMapping("/delete/{deviceid}")
    public String DeleteById(int deviceid)
    {
    	return dserv.deleteDevice(deviceid);
    }
}
