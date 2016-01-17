package com.palette.busi.project.tms.tool.entity;

import com.palette.busi.project.tms.tool.entity.util.CodeGenerator;
import com.palette.busi.project.tms.tool.entity.util.FileCleaner;

public class Runner {

	public static void main(String[] args) {
		
		try {
			
			FileCleaner.cleanCodeFiles();
			
			CodeGenerator generator = new CodeGenerator();
			generator.generate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
