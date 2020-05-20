package id.kingspr.springsftp;

import id.kingspr.springsftp.config.SftpConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("api/v1/sftp")
public class SendFileToSFTP {
    @Autowired
    private SftpConfig.UploadGateway uploadGateway;

    @PostMapping
    public ResponseEntity runnigSFTP(){
        File fileToUpload = new File("/home/kingspr/upload/newFile.txt");
        uploadGateway.upload(fileToUpload);

        return ResponseEntity.ok().body("Success");
    }
}
