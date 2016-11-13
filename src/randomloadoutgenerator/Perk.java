/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomloadoutgenerator;

/**
 *
 * @author Ross
 */
public enum Perk {
    LOAD_DROPPER,
    BACKPACKER,
    MAN_TRACKER,
    MASTER_CRAFTER,
    TRAPPER,
    MONEYBAGS,
    CHEMIST,
    INHUMAN,
    CANNIBAL,
    REGENERATOR,
    ANGRY_OCTOPUS,
    MANGLER,
    BRUTUS,
    BASHER,
    BOW_FLEXER,
    GOLDEN_ARM;
    
    public static Perk getRandom() {
        return Perk.values()[(int) (Math.random()*Perk.values().length)];
    }
}
