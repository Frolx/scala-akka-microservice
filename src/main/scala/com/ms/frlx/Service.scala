package com.ms.frlx

import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.stream.Materializer
import jdk.nashorn.internal.runtime.regexp.joni.Config

import scala.concurrent.ExecutionContextExecutor

/**
  * Created by dbatir on 3/10/2017.
  */
trait Service {
  implicit val system: ActorSystem
  implicit def executor: ExecutionContextExecutor
  implicit  val materializer: Materializer

  def config: Config
  val logger: LoggingAdapter

  val routes = {

  }
}
