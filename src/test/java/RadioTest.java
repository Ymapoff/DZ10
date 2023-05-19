import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(6);

        radio.next();

        int expenced = 7;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expenced, actual);
    }


    @Test
    public void nextRadioStationFalse() {
        Radio radio = new Radio();

        radio.setRadioStation(9);

        radio.next();

        int expenced = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(6);

        radio.prev();

        int expenced = 5;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void prevRadioStationFalse() {
        Radio radio = new Radio();

        radio.setRadioStation(0);

        radio.prev();

        int expenced = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void currentStationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expensed = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expensed, actual);
    }

    @Test
    public void currentStationMaxFalse() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expensed = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expensed, actual);
    }

    @Test
    public void currentStationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expensed = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expensed, actual);
    }

    @Test
    public void currentStationMinFalse() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expensed = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expensed, actual);
    }

    @Test
    public void minVolumeRadio() {
        Radio radio = new Radio();

        radio.setVolumeRadio(0);

        int expenced = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);

    }

    @Test
    public void maxVolumeRadio() {
        Radio radio = new Radio();

        radio.setVolumeRadio(100);

        int expenced = 100;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void increaseVolumeRadio() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(55);

        int expenced = 56;
        int actual = radio.setVolumeRadio2();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void increaseVolumeRadioFalse() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(100);

        int expenced = 100;
        int actual = radio.setVolumeRadio2();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void reduceVolumeRadio() {
        Radio radio = new Radio();

        radio.getReduceVolume(55);

        int expenced = 54;
        int actual = radio.setVolumeRadio2();
        Assertions.assertEquals(expenced, actual);
    }


    @Test
    public void reduceVolumeRadioFalse() {
        Radio radio = new Radio();

        radio.getReduceVolume(-2);

        int expenced = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }
}