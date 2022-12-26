package pokey.alexs.mod.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class TestconfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BOATH;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SLOW_ONLY;
	public static final ForgeConfigSpec.ConfigValue<Boolean> HEAVY_ONLY;
	static {
		BUILDER.push("tungsten heavy");
		BOATH = BUILDER.comment("slow but heavy hitting").define("boath", true);
		SLOW_ONLY = BUILDER.define("slow only", false);
		HEAVY_ONLY = BUILDER.define("heavy only", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
