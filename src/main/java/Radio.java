public class Radio {
    private int radioStation;
    private int volumeRadio;
    private int adjustmentVolume;


    public void setRadioStation(int radioStation) {
        this.radioStation = radioStation;
    }

    public void next() {
        if (radioStation != 9) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void prev() {
        if (radioStation != 0) {
            radioStation--;
        } else {
            radioStation = 9;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.radioStation = currentStation;
    }


    public void setVolumeRadio(int volumeRadio) {
        this.volumeRadio = volumeRadio;
    }

    public void volumeRadioUp() {

        if (volumeRadio != 100) {
            volumeRadio++;
        } else {
            volumeRadio = 100;
        }
    }

    public void volumeRadioDown() {

        if (volumeRadio != 0) {
            volumeRadio--;
        } else {
            volumeRadio = 0;
        }
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setAdjustmentVolume(int adjustmentVolume) {
        if (adjustmentVolume > 100) {
            return;
        }
        if (adjustmentVolume < 0) {
            return;
        }
        this.volumeRadio = adjustmentVolume;
    }


}