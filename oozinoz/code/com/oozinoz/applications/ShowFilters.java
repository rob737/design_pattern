package com.oozinoz.applications;

import java.io.*;

import com.oozinoz.io.*;

/*
 * Copyright (c) 2001 Steven J. Metsker.
 * 
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose, 
 * including the implied warranty of merchantability.
 *
 * Please use this software as you wish with the sole
 * restriction that you may not claim that you wrote it.
 */
/**
 * Show filters that wrap and title-case the characters
 * in a file supplied on the command line.
 * 
 * @author Steven J. Metsker
 */
public class ShowFilters 
{
/**
 * Show a filter that wraps and title-cases the characters
 * in a file supplied on the command line.
 */
public static void main(String args[])
	throws IOException {
	// 
	BufferedReader in =
		new BufferedReader(new FileReader(args[0]));
	Writer out = new FileWriter(args[1]);
	out = new WrapFilter(new BufferedWriter(out), 40);
	out = new TitleCaseFilter(out);
	while (true)
	{
		String s = in.readLine();
		if (s == null)
		{
			break;
		}
		out.write(s + "\n");
	}
	out.close();
	in.close();
}
}