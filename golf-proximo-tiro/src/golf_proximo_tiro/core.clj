(ns ^{:doc "Calculos necesarios para golf-proximo-tiro"
       :author "Sergio Piano"}
	golf-proximo-tiro.core)

;here begins the code to proximity

;defining the iron club
(def irons ["Driver (Total)" "Driver (Carry)" "3-Wood" "5-Wood" "Hybrid" "3-Iron" "4-Iron" "5-Iron" "6-Iron" "7-Iron" "8-Iron" "9-Iron" "PW"])
;defining the wind speed mph
(def wind-mph [60 70 80 90 100 110 120 130 140])
;defining the wind speed kmh
(def wind-kmh (map  #(* % 1.60934) wind-mph))
;defining distances
(def distance-yrds [
		[155 181 206 232 258 284 310 335 361]
		[144 168 192 216 240 264 288 312 336]
		[130 152 174 195 217 239 260 282 304]
		[123 144 164 185 205 226 246 267 288]
		[121 141 161 181 201 221 241 261 281]
		[114 133 151 170 189 208 227 246 265]
		[109 127 145 163 181 199 218 236 254]
		[104 121 139 156 173 191 208 225 243]
		[98 114 131 147 163 180 196 212 229]
		[92 108 123 138 154 169 184 200 215]
		[86 100 114 129 143 157 171 186 200]
		[79 93 106 119 132 145 159 172 185]
		[73 85 97 109 121 134 146 158 170]
	])
;defining the distances in kms
(def distance-kms (for [list distance-yrds] (map  #(* % 0.0009144) list)))
;defining the distances in mts
(def distance-mts (for [list distance-yrds] (map  #(* % 0.9144) list)))

(defn getPositionLastElem [x v] (.indexOf v (last (filter #(<= % x) v))))
(defn getPositionFirstElem [x v] (.indexOf v (first (filter #(<= % x) v))))

(defn getDistanceVector
	"return a vector by column"
	[column]
	(for [x distance-yrds] (get x column)))

(defn next-shoot-yrd-mph
	"returns the next suggested club depending on distance and wind in yards and mph"
	[distance wind]
	;borders
	(if (number? distance)
		(if (number? wind)
			(if (< wind (first wind-mph))
				(last irons)
				(if (> wind (last wind-mph))
					(first irons)
					(get irons 
						(getPositionFirstElem distance 
							(getDistanceVector 
								(getPositionLastElem wind wind-mph)
								)
							)
						)
					)
				)
			)
		)
	)
