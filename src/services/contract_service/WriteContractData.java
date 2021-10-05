package services.contract_service;
import models.contract.Contract;
import java.util.ArrayList;
import java.util.List;

import static utils.ReadAndWriteFile.writeFile;

public class WriteContractData {
    public static void writeFileContract(List<Contract> contractList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractList) {
            stringList.add(contract.getInformationContract());
        }
        writeFile(stringList, path, append);
    }
}

