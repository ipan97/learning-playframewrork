package controllers
  import play.api.libs.json.Json
/**
  * Created by ipant on 11/03/2017.
  */
case class AvailabilityResponse(result: String, ticketQuantity: Option[Long])

object AvailabilityResponse{
  implicit  val responseFormat = Json.format[AvailabilityResponse]
}
