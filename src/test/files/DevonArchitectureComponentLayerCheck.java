/*
 * This is a header...
 */
package io.oasp.ide.sonarqube.component1.logic.api;

import io.oasp.ide.sonarqube.component2.dataaccess.api.Bar; // Noncompliant

class MyClass {

  private io.oasp.ide.sonarqube.component2.dataaccess.api.Foo foo; // Noncompliant

  private Bar bar;

  public io.oasp.ide.sonarqube.component2.dataaccess.api.Foo getFoo() { // Noncompliant
    return this.foo;
  }

  public void init() {

    this.foo = new io.oasp.ide.sonarqube.component2.dataaccess.api.Foo();// Noncompliant
  }
}