package com.emrecellebi;

public class Test
{
	public static void main(String[] args)
	{
		/// Belirtilen anahtar tarafından belirtilen java sistem özelliğini alır.
		System.out.println(System.getProperty("user.name"));
		
		/// Değişken btanımlı değil ise verilen ön tanımlı değeri atama yapar
		System.out.println(System.getProperty("user.name", "Asus"));
	}
}

/**
{
	java.runtime.name=Java(TM) SE Runtime Environment
	sun.boot.library.path=C:\Program Files\Java\jre1.8.0_271\bin
	java.vm.version=25.271-b09
	java.vm.vendor=Oracle Corporation
	java.vendor.url=http://java.oracle.com/
	path.separator=;
	ava.vm.name=Java HotSpot(TM) 64-Bit Server VM
	file.encoding.pkg=sun.io
	user.country=TR
	user.script=
	sun.java.launcher=SUN_STANDARD
	sun.os.patch.level=
	java.vm.specification.name=Java Virtual Machine Specification
	user.dir=D:\Cizimler\Java\01\src
	java.runtime.version=1.8.0_271-b09
	java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
	java.endorsed.dirs=C:\Program Files\Java\jre1.8.0_271\lib\endorsed
	os.arch=amd64
	java.io.tmpdir=C:\Users\Asus\AppData\Local\Temp\
	line.separator=
	java.vm.specification.vendor=Oracle Corporation
	user.variant=
	os.name=Windows 10
	sun.jnu.encoding=Cp1254
	java.library.path=C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files (x86)\Autodesk\Backburner\;C:\Program Files (x86)\Common Files\Autodesk Shared\;C:\Program Files\Common Files\Autodesk Shared\;C:\Program Files\Java\jdk1.8.0_251\bin;C:\Windows\Microsoft.NET\Framework\v4.0.30319;C:\Users\Asus\AppData\Local\Programs\Python\Python38-32;C:\Users\Asus\AppData\Local\Programs\Python\Python38-32\Scripts;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\C++_Compiler\bin;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\CMake\bin;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\NESBuild\CC65\bin;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\PortableGit\bin;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\PortableGit;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\nmap-7.91;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\maven\bin;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\Bochs-2.6.8;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\Qemu;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\WinRAR;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\cdrtools-1.11a12-win32;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\UnrealPakTool;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\Lua\bin;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\Nasm;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\NodeJS;D:\Yeni_Kilasor\Kurulmus_Dosyalar\Programlar\PATH\Make\bin;;C:\Program Files (x86)\dotnet\;C:\Program Files\dotnet\;C:\Users\Asus\AppData\Local\Microsoft\WindowsApps;C:\Users\Asus\.dotnet\tools;.
	java.specification.name=Java Platform API Specification
	java.class.version=52.0
	sun.management.compiler=HotSpot 64-Bit Tiered Compilers
	os.version=10.0
	user.home=C:\Users\Asus
	user.timezone=
	java.awt.printerjob=sun.awt.windows.WPrinterJob
	file.encoding=Cp1254
	java.specification.version=1.8
	java.class.path=../bin;
	user.name=Asus
	java.vm.specification.version=1.8
	sun.java.command=com.emrecellebi.Test
	java.home=C:\Program Files\Java\jre1.8.0_271
	sun.arch.data.model=64
	user.language=tr
	java.specification.vendor=Oracle Corporation
	awt.toolkit=sun.awt.windows.WToolkit
	java.vm.info=mixed mode
	java.version=1.8.0_271
	java.ext.dirs=C:\Program Files\Java\jre1.8.0_271\lib\ext;C:\Windows\Sun\Java\lib\ext
	sun.boot.class.path=C:\Program Files\Java\jre1.8.0_271\lib\resources.jar;C:\Program Files\Java\jre1.8.0_271\lib\rt.jar;C:\Program Files\Java\jre1.8.0_271\lib\sunrsasign.jar;C:\Program Files\Java\jre1.8.0_271\lib\jsse.jar;C:\Program Files\Java\jre1.8.0_271\lib\jce.jar;C:\Program Files\Java\jre1.8.0_271\lib\charsets.jar;C:\Program Files\Java\jre1.8.0_271\lib\jfr.jar;C:\Program Files\Java\jre1.8.0_271\classes
	java.vendor=Oracle Corporation
	sun.stderr.encoding=cp857
	file.separator=\
	java.vendor.url.bug=http://bugreport.sun.com/bugreport/
	sun.io.unicode.encoding=UnicodeLittle
	sun.cpu.endian=little
	sun.stdout.encoding=cp857
	sun.desktop=windows
	sun.cpu.isalist=amd64
}

**/