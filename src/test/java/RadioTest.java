import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();

        radio.getRadioStation(0);

        int expenced = 0;
        int actual = radio.setRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();

        radio.getRadioStation(9);

        int expenced = 9;
        int actual = radio.setRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void IncreaseRadioStation() {
        Radio radio = new Radio();

        radio.getIncreaseStation(5);

        int expenced = 6;
        int actual = radio.setRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void IncreaseRadioStationFalse() {
        Radio radio = new Radio();

        radio.getIncreaseStation(9);

        int expenced = 9;
        int actual = radio.setRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void ReduceRadioStationFalse() {
        Radio radio = new Radio();

        radio.getReduceStation(0);
        int expenced = 0;
        int actual = radio.setRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void ReduceRadioStation() {
        Radio radio = new Radio();

        radio.getReduceStation(4);
        int expenced = 3;
        int actual = radio.setRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void randomRadioStation() {
        Radio radio = new Radio();

        radio.getRadioStation(6);

        int expenced = 6;
        int actual = radio.setRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void minVolumeRadio() {
        Radio radio = new Radio();

        radio.getVolumeRadio(0);

        int expenced = 0;
        int actual = radio.setVolumeRadio();
        Assertions.assertEquals(expenced, actual);

    }

    @Test
    public void maxVolumeRadio() {
        Radio radio = new Radio();

        radio.getVolumeRadio(100);

        int expenced = 100;
        int actual = radio.setVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void increaseVolumeRadio() {
        Radio radio = new Radio();

        radio.getIncreaseVolume(55);

        int expenced = 56;
        int actual = radio.setVolumeRadio2();
        Assertions.assertEquals(expenced, actual);
    }
    @Test
    public void increaseVolumeRadioFalse() {
        Radio radio = new Radio();

        radio.getIncreaseVolume(100);

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
        int actual = radio.setVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }
}