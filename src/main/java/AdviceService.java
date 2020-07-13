
import database.Slip;
import database.SlipDao;
import http.SlipDto;

import java.util.List;

//obsluga BD

public class AdviceService {


    public void saveAdvice(SlipDto slip) {
        Slip slipToSave = new Slip(slip);
        SlipDao slipDao = new SlipDao();
        slipDao.insertOrUpdate(slipToSave);

    }

    public List<Slip> getAllAdvices() {

        SlipDao slipDao = new SlipDao();
        List<Slip> slips = slipDao.getAll();
        return slips;
    }

    public void deleteID(Long id) {

        SlipDao slipDao = new SlipDao();
        System.out.println("Succes: " + slipDao.deleteID(id));
    }


    public void getRandomAdvice() {

    }
}