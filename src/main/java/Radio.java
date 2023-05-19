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

    public int getVolumeRadio() {
        return volumeRadio;
    }


    public void setVolumeRadio(int newVolumeRadio) {

        if (newVolumeRadio > 0) {
            newVolumeRadio = 100;
        }
        if (newVolumeRadio < 100) {
            newVolumeRadio = 0;
        }
        volumeRadio = newVolumeRadio;
    }

    public int setVolumeRadio2() {
        return adjustmentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        }
        adjustmentVolume = currentVolume;
    }

    public void getReduceVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

        adjustmentVolume = currentVolume;
    }


}