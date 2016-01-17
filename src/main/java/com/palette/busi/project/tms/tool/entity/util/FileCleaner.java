package com.palette.busi.project.tms.tool.entity.util;

import java.io.File;

public class FileCleaner {

	public static void cleanCodeFiles() {
		
		File codeDir = new File("./src/code/");
		deleteDir(codeDir);
	}
	
	private static boolean deleteDir(File dir) {
		
		if(dir.isDirectory()) {
			String[] children = dir.list();
            for (int i = 0; i< children.length; i++) {
                boolean isSuccess = deleteDir(new File(dir, children[i]));
                if(!isSuccess) return false;
            }
		}
		
		return dir.delete();
	}
}
