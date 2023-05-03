import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(0);

        int expenced = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(9);

        int expenced = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void randomRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(6);

        int expenced = 6;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expenced, actual);
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

        radio.increaseVolume(55);

        int expenced = 56;
        int actual = radio.setVolumeRadio2();
        Assertions.assertEquals(expenced, actual);
    }

    @Test
    public void reduceVolumeRadio() {
        Radio radio = new Radio();

        radio.reduceVolume(55);

        int expenced = 54;
        int actual = radio.setVolumeRadio2();
        Assertions.assertEquals(expenced, actual);
    }
}
