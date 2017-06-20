- In this project i've created one controller servlet to control which page/action should be served or taken,
i only created to patterns urls (/Hotels and /Hotel):

/Hotels: 
  1- Initate a ApiRequest object and passes the Offers Api Url with any extra parameters, 
      and calls a get method, the respone of ApiRequest will be json string that then will be pass
      to HotelUtil method helper to generate for us a list of hotel objects 
      so then we can easily display these results as what we want.
      
  2- Returns a page (WebContent/hotels.jsp) that will take care of rendering html tags that will displays 
      all hotels returned from Api Call
      
/Hotel: 
  1- Get invidual hotel object from session
  
  2- Returns a page (WebContent/hotels.jsp) passing the hotel object as an attriubte of the page and render the hotel info
     such as title, description and a google map of the location of hotel.

- I've used Bootstrap as html template
