package uz.bnpl.client.service;

import uz.bnpl.client.constant.Language;
import uz.bnpl.client.model.dto.ClientInfoDto;
import uz.bnpl.client.model.request.myId.MyIdProfileRequest;

public interface ClientInfoService {
    ClientInfoDto create(MyIdProfileRequest myIdProfileRequest, Language acceptLanguage);
}
