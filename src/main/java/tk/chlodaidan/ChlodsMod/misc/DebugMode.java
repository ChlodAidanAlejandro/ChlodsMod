package tk.chlodaidan.ChlodsMod.misc;

import net.minecraft.crash.CrashReport;
import net.minecraft.util.ReportedException;
import net.minecraftforge.common.config.Configuration;

public class DebugMode {

	public static Boolean DEBUGMODE = Config.debugHandlerConfig;
	
	public static void mainRegistry() {
		if (DEBUGMODE == true) {
			System.out.println("=====================================================");
			System.out.println("THIS MOD IS IN DEBUG MODE! UNLESS YOU SET YOUR CONFIG");
			System.out.println("      TO THIS, THIS IS NOT SUPPOSED TO HAPPEN!");
			System.out.println("=====================================================");
			
		} else {
			if(DEBUGMODE == false) {
				System.out.println("Initializing objects...");
			} else {
				throw new ReportedException(new CrashReport("DebugMode can only be true/false!", new Throwable()));
			}
		}
	}
}