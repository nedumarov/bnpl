package uz.bnpl.client.service.mapper;

import org.springframework.stereotype.Component;
import uz.bnpl.client.constant.Language;
import uz.bnpl.client.constant.Sex;
import uz.bnpl.client.entity.ClientInfo;
import uz.bnpl.client.model.dto.ClientInfoDto;
import uz.bnpl.client.model.request.myId.MyIdCommonDataRequest;

@Component
public class ClientInfoMapper {

    public ClientInfo toEntity(MyIdCommonDataRequest myIdCommonDataRequest, Language language) {
        return ClientInfo.builder()
                .preferableLanguage(language)
                .birthDate(myIdCommonDataRequest.birthDate())
                .firstName(myIdCommonDataRequest.firstName())
                .lastName(myIdCommonDataRequest.lastName())
                .patronymic(myIdCommonDataRequest.middleName())
                .pin(myIdCommonDataRequest.pinfl())
                .sex(getSex(myIdCommonDataRequest.gender()))
                .build();
    }

    public ClientInfoDto toDto(ClientInfo clientInfo) {
        return ClientInfoDto.builder()
                .id(clientInfo.getId())
                .createdAt(clientInfo.getCreatedAt())
                .updatedAt(clientInfo.getUpdatedAt())
                .sex(clientInfo.getSex())
                .preferableLanguage(clientInfo.getPreferableLanguage())
                .firstName(clientInfo.getFirstName())
                .lastName(clientInfo.getLastName())
                .patronymic(clientInfo.getPatronymic())
                .birthDate(clientInfo.getBirthDate())
                .pin(clientInfo.getPin())
                .build();
    }

    private Sex getSex(String gender) {
        return switch (gender.toUpperCase().trim()) {
            case "MALE", "M", "0" -> Sex.MALE;
            case "FEMALE", "F", "1" -> Sex.FEMALE;
            default -> Sex.OTHER;
        };
    }

}
