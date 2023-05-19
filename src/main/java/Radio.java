public class Radio {
    private int radioStation;
    private int volumeRadio;

    private int quantityStation = 10;
    private int maxRadioStation = quantityStation - 1;
    private int minRadioStation = 0;
    public int currentRadioStation = maxRadioStation;
    private int maxVolumeRadio = 100;
    private int minVolumeRadio = 0;
    public int currentVolumeRadio = minVolumeRadio;

    public Radio() {

    }

    public Radio(int quantityStation) {
        if (quantityStation < minRadioStation) {
            return;
        } else {
            this.quantityStation = quantityStation;
        }
        this.minRadioStation = quantityStation - 1;
    }

    public void setRadioStation(int radioStation) {

        this.radioStation = radioStation;
    }

    public void next() {
        if (radioStation != maxRadioStation) {
            radioStation++;
        } else {
            radioStation = minRadioStation;
        }
    }

    public void prev() {
        if (radioStation != minRadioStation) {
            radioStation--;
        } else {
            radioStation = maxRadioStation;
        }
    }

    public int getRadioStation() {

        return radioStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxRadioStation) {
            return;
        }
        if (currentStation < minRadioStation) {
            return;
        }
        this.radioStation = currentStation;
    }


    public void setVolumeRadio(int volumeRadio) {
        this.volumeRadio = volumeRadio;
    }

    public void volumeRadioUp() {

        if (volumeRadio != maxVolumeRadio) {
            volumeRadio++;
        } else {
            volumeRadio = maxVolumeRadio;
        }
    }

    public void volumeRadioDown() {

        if (volumeRadio != minVolumeRadio) {
            volumeRadio--;
        } else {
            volumeRadio = minVolumeRadio;
        }
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setAdjustmentVolume(int adjustmentVolume) {
        if (adjustmentVolume > maxVolumeRadio) {
            return;
        }
        if (adjustmentVolume < minVolumeRadio) {
            return;
        }
        this.volumeRadio = adjustmentVolume;
    }


}