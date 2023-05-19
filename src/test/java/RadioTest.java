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
    public void VolumeRadioUp() {
        Radio radio = new Radio();

        radio.setVolumeRadio(56);

        radio.volumeRadioUp();

        int expenced = 57;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);

    }

    @Test
    public void VolumeRadioUpFalse() {
        Radio radio = new Radio();

        radio.setVolumeRadio(100);

        radio.volumeRadioUp();

        int expenced = 100;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);

    }

    @Test
    public void VolumeRadioDown() {
        Radio radio = new Radio();

        radio.setVolumeRadio(56);

        radio.volumeRadioDown();

        int expenced = 55;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);

    }

    @Test
    public void VolumeRadioDownFalse() {
        Radio radio = new Radio();

        radio.setVolumeRadio(0);

        radio.volumeRadioDown();

        int expenced = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);

    }

    @Test
    public void adjustmentVolumeMax() {
        Radio radio = new Radio();

        radio.setAdjustmentVolume(100);

        int expenced = 100;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void adjustmentVolumeMaxFalse() {
        Radio radio = new Radio();

        radio.setAdjustmentVolume(111);

        int expenced = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void adjustmentVolumeMin() {
        Radio radio = new Radio();

        radio.setAdjustmentVolume(0);

        int expenced = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void adjustmentVolumeMinFalse() {
        Radio radio = new Radio();

        radio.setAdjustmentVolume(-1);

        int expenced = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expenced, actual);
    }

}