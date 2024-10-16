package fpt.userService.common;

import fpt.userService.entity.UserEntity;
import fpt.userService.service.crudService.CrudUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class commonServiceImpl implements commonService {
    private final CrudUserServiceImpl crudUserService;
    @Autowired
    public commonServiceImpl(CrudUserServiceImpl crudUserService) {
        this.crudUserService = crudUserService;
    }

    public List<String> extractAddress(int id) {
        UserEntity user = crudUserService.getUserById(id);
        String address = user.getAddress();
        String[] addressParts = address.split(",\\s*");
        String addressInfo1 = "";
        String addressInfo2 = "";
        String addressInfo3 = "";
        List<String> addressInfoList = new ArrayList<>();
        if (addressParts.length >= 3) {
            addressInfo1 = addressParts[addressParts.length - 2].trim();
            addressInfo2 = addressParts[addressParts.length - 1].trim();
            addressInfo3 = addressParts[addressParts.length].trim();
            addressInfoList.add(addressInfo1);
            addressInfoList.add(addressInfo2);
            addressInfoList.add(addressInfo3);
        }
        else if (addressParts.length == 2) {
            addressInfo1 = addressParts[0].trim();
            addressInfo2 = addressParts[1].trim();
            addressInfoList.add(addressInfo1);
            addressInfoList.add(addressInfo2);

        }
        else if (addressParts.length == 1) {
            addressInfo1 = addressParts[0].trim();
            addressInfoList.add(addressInfo1);
        }
        else {
            String addressInfo = "No address information";
            addressInfoList.add(addressInfo);
        }
        for (int i = 0; i < addressInfoList.size(); i++) {
            String normalizeAddress = addressInfoList.get(i).trim().replaceAll("\\s+", " ").toLowerCase();
            //replace original address with normalized address
            addressInfoList.set(i, normalizeAddress);
        }
        return addressInfoList;
    }
}
