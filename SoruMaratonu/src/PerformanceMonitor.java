public class PerformanceMonitor { 
	 public static native long getProcessCPUTime ();
	public PerformanceMonitor() {
		
	}
	public static void main(String[] args) {
//		MBeanServerConnection mbsc = ManagementFactory.getPlatformMBeanServer();
//
//		OperatingSystemMXBean osMBean = ManagementFactory.newPlatformMXBeanProxy(
//		mbsc, ManagementFactory.OPERATING_SYSTEM_MXBEAN_NAME, OperatingSystemMXBean.class);
//
//		long nanoBefore = System.nanoTime();
//		long cpuBefore = osMBean.getProcessCpuTime();
//
//		// Call an expensive task, or sleep if you are monitoring a remote process
//
//		long cpuAfter = osMBean.getProcessCpuTime();
//		long nanoAfter = System.nanoTime();
//
//		long percent;
//		if (nanoAfter > nanoBefore)
//		 percent = ((cpuAfter-cpuBefore)*100L)/
//		   (nanoAfter-nanoBefore);
//		else percent = 0;
//
//		System.out.println("Cpu usage: "+percent+"%");
	}
	public long getJVMCpuTime( ) {
		   OperatingSystemMXBean bean =
		       ManagementFactory.getOperatingSystemMXBean( );
		   if ( ! (bean instanceof
		       sun.com.management.OperatingSystemMXBean) )
		       return 0L;
		   return ((sun.com.management.OperatingSystemMXBean)bean)
		       .getProcessCpuTime( );
		}
}