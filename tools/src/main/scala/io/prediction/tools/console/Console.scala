package io.prediction.tools.console

/**
  * Created by frank on 16-4-1.
  */
case class  ConsoleArgs(
                       common:ConsoleArgs,
                       build:BuildArgs,
                       app:AppArgs=AppArgs(),
                       accessKey:AccessKeyArgs=AccessKeyArgs()
                       )
case class CommonArgs(

                     )
case class BuildArgs()
case class DeployArgs()
case class EventServerArgs()
case class AdminServerArgs()
case class DashboardArgs()
case class UpgradeArgs()

class Console {

}
