public class Radio {
    private int radioStation;
    private int adjustmentStation;
    private int volumeRadio;
    private int adjustmentVolume;


    public int setRadioStation() {
        return radioStation;
    }

    public int getRadioStation(int newRadioStation) {
        if (newRadioStation > 0) {
            int prev = 9;
        }
        if (newRadioStation < 9) {
            int next = 0;
        }
        radioStation = newRadioStation;
       return newRadioStation;
    }


    public void getIncreaseStation(int currentStation) {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        radioStation = currentStation;
    }

    public void getReduceStation(int currentStation) {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        radioStation = currentStation;
    }

    public int setVolumeRadio() {
        return volumeRadio;
    }


    public void getVolumeRadio(int newVolumeRadio) {

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

    public void getIncreaseVolume(int currentVolume) {
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