package enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum withLombok {

    IND("IND","INDIA"),
    CAN("can","cANADA");

    private final String code;
    private final String country;

}
