input "button" on 9
input "button2" on 11
output "led" on 10
lcd "screen" 
	config 10,11,12,13,14 
	dim 16,2 
	refresh 500

state "on" means
	_ led value low
	_ screen display "on"

state "off" means
	_ led value high
	_ screen display "off"

from on to off when
	_ button eq low
		or
	_ button2 ne low
	
from on to off when
	_ button lt low
		and
	_ button2 gt high

from off to on when
	_ button le high
		and 
	_ button2 ge high

initial off

export "Switch!"