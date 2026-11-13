package dev.abdulslam.fulan.entities;

import java.util.List;

/**
 * The 13 administrative regions of Saudi Arabia.
 * <p>
 * Each region carries the data other providers need:
 * <ul>
 *   <li>{@code isoCode}: ISO 3166-2 subdivision code (SA-01 … SA-14)</li>
 *   <li>{@code areaCode}: landline prefix (CST numbering plan, 2013)</li>
 *   <li>{@code postalPrefixes}: first two digits of 5-digit postal codes used in the region</li>
 *   <li>{@code population}: GASTAT 2022 census total (Saudi + non-Saudi)</li>
 * </ul>
 * Sources and verification dates are listed in {@code docs/DATA_SOURCES.md}.
 */
public enum Region {
    RIYADH("الرياض", "Riyadh", "SA-01", "011", List.of("11", "12", "13", "14", "15", "16", "17"), 8_591_748),
    MAKKAH("مكة المكرمة", "Makkah", "SA-02", "012", List.of("21", "22", "23", "24", "25", "26"), 8_021_463),
    MADINAH("المدينة المنورة", "Madinah", "SA-03", "014", List.of("41", "42", "46"), 2_137_983),
    EASTERN_PROVINCE("المنطقة الشرقية", "Eastern Province", "SA-04", "013", List.of("31", "32", "34", "35", "36", "39"), 5_125_254),
    QASSIM("القصيم", "Al-Qassim", "SA-05", "016", List.of("51", "52"), 1_336_179),
    HAIL("حائل", "Hail", "SA-06", "016", List.of("55"), 746_406),
    TABUK("تبوك", "Tabuk", "SA-07", "014", List.of("47", "48", "49"), 886_036),
    NORTHERN_BORDERS("الحدود الشمالية", "Northern Borders", "SA-08", "014", List.of("73", "75", "76"), 373_577),
    JAZAN("جازان", "Jazan", "SA-09", "017", List.of("82", "83", "84", "85", "86"), 1_404_997),
    NAJRAN("نجران", "Najran", "SA-10", "017", List.of("66"), 592_300),
    AL_BAHA("الباحة", "Al-Baha", "SA-11", "017", List.of("65"), 339_174),
    AL_JOUF("الجوف", "Al-Jouf", "SA-12", "014", List.of("72", "77"), 595_822),
    ASIR("عسير", "Asir", "SA-14", "017", List.of("61", "62"), 2_024_285);

    private final String ar;
    private final String en;
    private final String isoCode;
    private final String areaCode;
    private final List<String> postalPrefixes;
    private final int population;

    Region(String ar, String en, String isoCode, String areaCode, List<String> postalPrefixes, int population) {
        this.ar = ar;
        this.en = en;
        this.isoCode = isoCode;
        this.areaCode = areaCode;
        this.postalPrefixes = postalPrefixes;
        this.population = population;
    }

    public String ar() {
        return ar;
    }

    public String en() {
        return en;
    }

    /** ISO 3166-2 code, e.g. {@code SA-01}. */
    public String isoCode() {
        return isoCode;
    }

    /** Landline area code including the leading zero, e.g. {@code 011}. */
    public String areaCode() {
        return areaCode;
    }

    /** First two digits of postal codes in this region; pick one and append three random digits. */
    public List<String> postalPrefixes() {
        return postalPrefixes;
    }

    /** Total residents in the 2022 census; useful as a weight when picking a random region. */
    public int population() {
        return population;
    }
}
