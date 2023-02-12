package com.sas.csvexport.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage {

    private String message;
    private String fileDownloadUri;

}
