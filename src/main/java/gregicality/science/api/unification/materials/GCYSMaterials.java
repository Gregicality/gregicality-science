package gregicality.science.api.unification.materials;

import gregtech.api.unification.material.Material;

public class GCYSMaterials {

    // Element Materials


    // First Degree Materials
    public static Material LanthanumOxide;
    public static Material PraseodymiumOxide;
    public static Material NeodymiumOxide;
    public static Material CeriumOxide;
    public static Material ScandiumOxide;
    public static Material EuropiumOxide;
    public static Material GadoliniumOxide;
    public static Material SamariumOxide;
    public static Material YttriumOxide;
    public static Material TerbiumOxide;
    public static Material DysprosiumOxide;
    public static Material HolmiumOxide;
    public static Material ErbiumOxide;
    public static Material ThuliumOxide;
    public static Material YtterbiumOxide;
    public static Material LutetiumOxide;
    public static Material PlatinumMetallic;
    public static Material PalladiumMetallic;
    public static Material AmmoniumHexachloroplatinate;
    public static Material ChloroplatinicAcid;
    public static Material PotassiumBisulfate;
    public static Material PotassiumPyrosulfate;
    public static Material PotassiumSulfate;
    public static Material ZincSulfate;
    public static Material SodiumNitrate;
    public static Material RhodiumNitrate;
    public static Material SodiumRuthenate;
    public static Material SodiumPeroxide;
    public static Material IridiumDioxideResidue;
    public static Material AmmoniumHexachloroIridiate;
    public static Material TungstenTrioxide;
    public static Material Hydrazine;
    public static Material HydrogenPeroxide;
    public static Material BerylliumOxide;
    public static Material TantalumPentoxide;
    public static Material NiobiumPentoxide;
    public static Material CalciumDifluoride;
    public static Material ManganeseDifluoride;


    // Second Degree Materials
    public static Material LaPrNdCeOxidesSolution;
    public static Material ScEuGdSmOxidesSolution;
    public static Material YTbDyHoOxidesSolution;
    public static Material ErThYtLuOxidesSolution;
    public static Material PlatinumGroupResidue;
    public static Material PalladiumRichAmmonia;
    public static Material CrudePlatinumResidue;
    public static Material CrudePalladiumResidue;
    public static Material IridiumGroupSludge;
    public static Material RhodiumSulfateSolution;
    public static Material CrudeRhodiumResidue;
    public static Material RhodiumSalt;
    public static Material AcidicSodiumRuthenateSolution;
    public static Material AcidicIridiumDioxideSolution;
    public static Material GrapheneOxide;


    // Third Degree Materials
    public static Material PlatinumPalladiumLeachate;
    public static Material RhodiumSaltSolution;


    // Organic Chemistry Materials
    public static Material Butyraldehyde;
    public static Material Ethylhexanol;
    public static Material DiethylhexylPhosphoricAcid;
    public static Material Butanol;
    public static Material MethylFormate;
    public static Material FormicAcid;
    public static Material PhthalicAnhydride;
    public static Material Ethylanthraquinone;
    public static Material Ethylanthrahydroquinone;


    // Unknown Composition Materials
    public static Material RareEarthHydroxidesSolution;
    public static Material RareEarthChloridesSolution;


    /**
     * 3100 - 19999
     */
    public static void init() {

        // 3100-3499
        GCYSElementMaterials.init();

        // 3500-5999
        GCYSFirstDegreeMaterials.init();

        // 6000-8999
        GCYSSecondDegreeMaterials.init();

        // 9000-11999
        GCYSThirdDegreeMaterials.init();

        // 12000-14999
        GCYSHighDegreeMaterials.init();

        // 15000-17999
        GCYSOrganicChemistryMaterials.init();

        // 18000-19999
        GCYSUnknownCompositionMaterials.init();

        GCYSMaterialFlagAddition.init();
    }
}
