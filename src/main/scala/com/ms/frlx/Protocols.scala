package com.ms.frlx

import spray.json.DefaultJsonProtocol

/**
  * Created by dbatir on 3/10/2017.
  */
trait Protocols extends DefaultJsonProtocol{
  implicit val timeFormat = jsonFormat2(Time.apply)
}
