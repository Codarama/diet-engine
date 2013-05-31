package net.ayld.facade.dependency.resolver;

import java.io.File;
import java.io.IOException;
import java.util.Set;


public interface ClassDependencyResolver {
	
	public Set<String> resolve(File sourceFile) throws IOException;
}