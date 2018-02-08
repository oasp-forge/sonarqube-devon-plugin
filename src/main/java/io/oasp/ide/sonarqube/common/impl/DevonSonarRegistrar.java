package io.oasp.ide.sonarqube.common.impl;

import java.util.ArrayList;
import java.util.List;

import org.sonar.plugins.java.api.CheckRegistrar;
import org.sonar.plugins.java.api.JavaCheck;
import org.sonarsource.api.sonarlint.SonarLintSide;

/**
 * TODO
 */
@SonarLintSide
public class DevonSonarRegistrar implements CheckRegistrar {

  @Override
  public void register(RegistrarContext registrarContext) {

    registrarContext.registerClassesForRepository(DevonSonarDefinition.REPOSITORY_KEY, checkClasses(),
        testCheckClasses());
  }

  public static List<Class<? extends JavaCheck>> checkClasses() {

    List<Class<? extends JavaCheck>> checks = new ArrayList<>();
    // checks.add(DevonArchitecturePackageCheck.class); // **
    // checks.add(DevonArchitectureScopeApiImplCheck.class); // **
    // checks.add(DevonArchitectureScopeApiBaseCheck.class); // **
    //
    // checks.add(DevonArchitectureLayerDataaccessServiceCheck.class);// **
    // checks.add(DevonArchitectureLayerDataaccessLogicCheck.class);// **
    // checks.add(DevonArchitectureLayerLogicServiceCheck.class); // **
    // checks.add(DevonArchitectureLayerServiceDataaccessCheck.class);

    // checks.add(DevonArchitecturePackageCheck.class);

    // add the new check class!
    return checks;
  }

  public static List<Class<? extends JavaCheck>> testCheckClasses() {

    return new ArrayList<>();
  }
}
