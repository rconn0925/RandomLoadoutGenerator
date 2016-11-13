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
public enum Airdrop {
    EARLY_BLUDGEON,
    EARLY_BLADE,
    EARLY_AXE,
    EARLY_SPEAR,
    MID_BASEBALL_BAT,
    MID_BOWIE_KNIFE,
    MID_KUKRI,
    MID_PIPE_WRENCH,
    MID_SABRE,
    MID_SURVIVAL_SPEAR,
    MID_TACTICAL_MACHETE,
    MID_TOMAHAWK,
    UTILITY_BAIT_CRATE,
    UTILITY_TRACKER,
    UTILITY_GOLDEN_ARM,
    UTILITY_MEDIC,
    UTILITY_TRAPPER,
    LATE_FIREMANS_AXE,
    LATE_KATANA,
    LATE_SLEDGEHAMMER,
    LATE_TRIDENT;
    
    public static Airdrop getRandom() {
        return Airdrop.values()[(int) (Math.random()*Airdrop.values().length)];
    }
}
