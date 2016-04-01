name := "core"

libraryDependencies ++= Seq(
  "com.github.scopt"       %% "scopt"            % "3.3.0",
  "com.google.code.gson"    % "gson"             % "2.5",
  "com.google.guava"        % "guava"            % "18.0",
  "com.twitter"            %% "chill"            % "0.7.2"
    exclude("com.esotericsoftware.minlog", "minlog"),
  "com.twitter"            %% "chill-bijection"  % "0.7.2",
  "de.javakaffee"           % "kryo-serializers" % "0.37",
  "commons-io"              % "commons-io"       % "2.4",
  "io.spray"               %% "spray-can"        % "1.3.3",
  "io.spray"               %% "spray-routing"    % "1.3.3",
  "net.jodah"               % "typetools"        % "0.3.1",
  "org.apache.spark"       %% "spark-core"       % sparkVersion.value % "provided",
  "org.clapper"            %% "grizzled-slf4j"   % "1.0.2",
  "org.elasticsearch"       % "elasticsearch"    % elasticsearchVersion.value,
  "org.json4s"             %% "json4s-native"    % json4sVersion.value,
  "org.json4s"             %% "json4s-ext"       % json4sVersion.value,
  "org.scalaj"             %% "scalaj-http"      % "1.1.0",
  "org.scalatest"          %% "scalatest"        % "2.1.6" % "test",
  "org.slf4j"               % "slf4j-log4j12"    % "1.7.13",
  "org.specs2"             %% "specs2"           % "2.3.13" % "test")

//testOptions := Seq(Tests.Filter(s => Seq("Dev").exists(s.contains(_))))

parallelExecution in Test := false
