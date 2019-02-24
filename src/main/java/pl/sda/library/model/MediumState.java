package pl.sda.library.model;

interface MediumState {
    MediumState borrowMedium(String firstName, String lastName);

    MediumState returnMedium();
}
