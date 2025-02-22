package uz.bnpl.client.service.mapper;

import org.springframework.stereotype.Component;
import uz.bnpl.client.entity.Address;
import uz.bnpl.client.model.dto.AddressDto;
import uz.bnpl.client.model.dto.PermanentAddressDto;
import uz.bnpl.client.model.dto.TemporaryAddressDto;
import uz.bnpl.client.model.request.myId.MyIdPermanentRegistrationRequest;
import uz.bnpl.client.model.request.myId.MyIdTemporaryRegistrationRequest;

@Component
public class AddressMapper {

    public Address toEntity(MyIdTemporaryRegistrationRequest myIdTemporaryRegistrationRequest) {
        return Address.builder()
                .address(myIdTemporaryRegistrationRequest.address())
                .districtId(myIdTemporaryRegistrationRequest.districtId())
                .districtIdCbu(myIdTemporaryRegistrationRequest.districtIdCbu())
                .region(myIdTemporaryRegistrationRequest.region())
                .countryIdCbu(myIdTemporaryRegistrationRequest.countryIdCbu())
                .regionId(myIdTemporaryRegistrationRequest.regionId())
                .cadastre(myIdTemporaryRegistrationRequest.cadastre())
                .countryId(myIdTemporaryRegistrationRequest.countryId())
                .district(myIdTemporaryRegistrationRequest.district())
                .country(myIdTemporaryRegistrationRequest.country())
                .regionIdCbu(myIdTemporaryRegistrationRequest.regionIdCbu())
                .build();
    }

    public Address toEntity(MyIdPermanentRegistrationRequest myIdTemporaryRegistrationRequest) {
        return Address.builder()
                .address(myIdTemporaryRegistrationRequest.address())
                .districtIdCbu(myIdTemporaryRegistrationRequest.districtIdCbu())
                .districtId(myIdTemporaryRegistrationRequest.districtId())
                .districtIdCbu(myIdTemporaryRegistrationRequest.districtIdCbu())
                .region(myIdTemporaryRegistrationRequest.region())
                .regionId(myIdTemporaryRegistrationRequest.regionId())
                .regionIdCbu(myIdTemporaryRegistrationRequest.regionIdCbu())
                .countryIdCbu(myIdTemporaryRegistrationRequest.countryIdCbu())
                .countryId(myIdTemporaryRegistrationRequest.countryId())
                .country(myIdTemporaryRegistrationRequest.country())
                .cadastre(myIdTemporaryRegistrationRequest.cadastre())
                .build();
    }

    public AddressDto toDto(Address address) {
        return AddressDto.builder()
                .address(address.getAddress())
                .districtIdCbu(address.getDistrictIdCbu())
                .districtId(address.getDistrictId())
                .districtIdCbu(address.getDistrictIdCbu())
                .region(address.getRegion())
                .regionId(address.getRegionId())
                .regionIdCbu(address.getRegionIdCbu())
                .countryIdCbu(address.getCountryIdCbu())
                .countryId(address.getCountryId())
                .country(address.getCountry())
                .cadastre(address.getCadastre())
                .build();
    }

    public Address toEntityFromDto(AddressDto addressDto) {
        return Address.builder()
                .address(addressDto.address())
                .districtIdCbu(addressDto.districtIdCbu())
                .districtId(addressDto.districtId())
                .districtIdCbu(addressDto.districtIdCbu())
                .region(addressDto.region())
                .regionId(addressDto.regionId())
                .regionIdCbu(addressDto.regionIdCbu())
                .countryIdCbu(addressDto.countryIdCbu())
                .countryId(addressDto.countryId())
                .country(addressDto.country())
                .cadastre(addressDto.cadastre())
                .build();
    }

    public AddressDto fromTemporaryToDto(TemporaryAddressDto temporaryAddressDto) {
        return AddressDto.builder()
                .address(temporaryAddressDto.address())
                .district(temporaryAddressDto.district())
                .districtId(temporaryAddressDto.districtId())
                .districtIdCbu(temporaryAddressDto.districtIdCbu())
                .countryIdCbu(temporaryAddressDto.countryIdCbu())
                .countryId(temporaryAddressDto.countryId())
                .country(temporaryAddressDto.country())
                .regionIdCbu(temporaryAddressDto.regionIdCbu())
                .regionId(temporaryAddressDto.regionId())
                .region(temporaryAddressDto.region())
                .cadastre(temporaryAddressDto.cadastre())
                .build();
    }

    public AddressDto fromPermanentToDto(PermanentAddressDto permanentAddressDto) {
        return AddressDto.builder()
                .address(permanentAddressDto.address())
                .district(permanentAddressDto.district())
                .districtId(permanentAddressDto.districtId())
                .districtIdCbu(permanentAddressDto.districtIdCbu())
                .countryIdCbu(permanentAddressDto.countryIdCbu())
                .countryId(permanentAddressDto.countryId())
                .country(permanentAddressDto.country())
                .regionIdCbu(permanentAddressDto.regionIdCbu())
                .regionId(permanentAddressDto.regionId())
                .region(permanentAddressDto.region())
                .cadastre(permanentAddressDto.cadastre())
                .build();
    }


    public PermanentAddressDto toPermanentDto(Address address){
        return PermanentAddressDto.builder()
                .address(address.getAddress())
                .districtIdCbu(address.getDistrictIdCbu())
                .districtId(address.getDistrictId())
                .districtIdCbu(address.getDistrictIdCbu())
                .region(address.getRegion())
                .regionId(address.getRegionId())
                .regionIdCbu(address.getRegionIdCbu())
                .countryIdCbu(address.getCountryIdCbu())
                .countryId(address.getCountryId())
                .country(address.getCountry())
                .cadastre(address.getCadastre())
                .build();
    }

    public TemporaryAddressDto toTemporaryDto(Address address){
        return TemporaryAddressDto.builder()
                .address(address.getAddress())
                .districtIdCbu(address.getDistrictIdCbu())
                .districtId(address.getDistrictId())
                .districtIdCbu(address.getDistrictIdCbu())
                .region(address.getRegion())
                .regionId(address.getRegionId())
                .regionIdCbu(address.getRegionIdCbu())
                .countryIdCbu(address.getCountryIdCbu())
                .countryId(address.getCountryId())
                .country(address.getCountry())
                .cadastre(address.getCadastre())
                .build();
    }


}
