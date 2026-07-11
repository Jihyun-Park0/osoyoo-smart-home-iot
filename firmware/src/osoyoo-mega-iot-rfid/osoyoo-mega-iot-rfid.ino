/*  ___   ___  ___  _   _  ___   ___   ____ ___  ____
 * / _ \ /___)/ _ \| | | |/ _ \ / _ \ / ___) _ \|    \
 *| |_| |___ | |_| | |_| | |_| | |_| ( (__| |_| | | | |
 * \___/(___/ \___/ \__  |\___/ \___(_)____)___/|_|_|_|
 *                  (____/
 * Use browser and OSOYOO MEGA-IoT extension shield to get message from remote browser
 * Tutorial URL  http://osoyoo.com/?p=28943
 * CopyRight www.osoyoo.com
 */
#include <SPI.h>
#include <RFID.h>

RFID rfid(48,49);   //D48--RFID module SDA pin縲．49 RFID module RST pin
void setup()
{
  Serial.begin(9600);
  SPI.begin();
  rfid.init();
  
  Serial.println("========================================");
  Serial.println("RFID Module Connection Diagnostic Start");
  Serial.println("========================================");
}

void loop()
{
  // search card
  if (rfid.isCard()) {
    Serial.println("-> [SUCCESS] Find the card!");
    
    if (rfid.readCardSerial()) {
      Serial.print("Card ID Serial: ");
      for (int i = 0; i < 5; i++) {
        Serial.print(rfid.serNum[i]);
        Serial.print(" ");
      }
      Serial.println();
    }
    rfid.halt();
  }
  delay(200);
}
