(ns tailwind-clj.config)

;; manually constructing the default tailwind configuration for now

;; Things to consider.
;; - Make this configurable like tailwind css. perhaps read a
;;   standard config file. maybe meta-merge will work nice
;; - Automated way to construct the full default config from tailwind

(def screens
  {"sm" "640px"
   "md" "768px"
   "lg" "1024px"
   "xl" "1280px"})

(def colors
  {"transparent" "transparent"
   "black"       "#000"
   "white"       "#fff"
   "gray"        {"100" "#f7fafc"
                  "200" "#edf2f7"
                  "300" "#e2e8f0"
                  "400" "#cbd5e0"
                  "500" "#a0aec0"
                  "600" "#718096"
                  "700" "#4a5568"
                  "800" "#2d3748"
                  "900" "#1a202c"}
   "red"         {"100" "#fff5f5"
                  "200" "#fed7d7"
                  "300" "#feb2b2"
                  "400" "#fc8181"
                  "500" "#f56565"
                  "600" "#e53e3e"
                  "700" "#c53030"
                  "800" "#9b2c2c"
                  "900" "#742a2a"}
   "orange"      {"100" "#fffaf0"
                  "200" "#feebc8"
                  "300" "#fbd38d"
                  "400" "#f6ad55"
                  "500" "#ed8936"
                  "600" "#dd6b20"
                  "700" "#c05621"
                  "800" "#9c4221"
                  "900" "#7b341e"}
   "yellow"      {"100" "#fffff0"
                  "200" "#fefcbf"
                  "300" "#faf089"
                  "400" "#f6e05e"
                  "500" "#ecc94b"
                  "600" "#d69e2e"
                  "700" "#b7791f"
                  "800" "#975a16"
                  "900" "#744210"}
   "green"       {"100" "#f0fff4"
                  "200" "#c6f6d5"
                  "300" "#9ae6b4"
                  "400" "#68d391"
                  "500" "#48bb78"
                  "600" "#38a169"
                  "700" "#2f855a"
                  "800" "#276749"
                  "900" "#22543d"}
   "teal"        {"100" "#e6fffa"
                  "200" "#b2f5ea"
                  "300" "#81e6d9"
                  "400" "#4fd1c5"
                  "500" "#38b2ac"
                  "600" "#319795"
                  "700" "#2c7a7b"
                  "800" "#285e61"
                  "900" "#234e52"}
   "blue"        {"100" "#ebf8ff"
                  "200" "#bee3f8"
                  "300" "#90cdf4"
                  "400" "#63b3ed"
                  "500" "#4299e1"
                  "600" "#3182ce"
                  "700" "#2b6cb0"
                  "800" "#2c5282"
                  "900" "#2a4365"}
   "indigo"      {"100" "#ebf4ff"
                  "200" "#c3dafe"
                  "300" "#a3bffa"
                  "400" "#7f9cf5"
                  "500" "#667eea"
                  "600" "#5a67d8"
                  "700" "#4c51bf"
                  "800" "#434190"
                  "900" "#3c366b"}
   "purple"      {"100" "#faf5ff"
                  "200" "#e9d8fd"
                  "300" "#d6bcfa"
                  "400" "#b794f4"
                  "500" "#9f7aea"
                  "600" "#805ad5"
                  "700" "#6b46c1"
                  "800" "#553c9a"
                  "900" "#44337a"}
   "pink"        {"100" "#fff5f7"
                  "200" "#fed7e2"
                  "300" "#fbb6ce"
                  "400" "#f687b3"
                  "500" "#ed64a6"
                  "600" "#d53f8c"
                  "700" "#b83280"
                  "800" "#97266d"
                  "900" "#702459"}})

(def spacing
  {"px" "1px"
   "0"  "0"
   "1"  "0.25rem"
   "2"  "0.5rem"
   "3"  "0.75rem"
   "4"  "1rem"
   "5"  "1.25rem"
   "6"  "1.5rem"
   "8"  "2rem"
   "10" "2.5rem"
   "12" "3rem"
   "16" "4rem"
   "20" "5rem"
   "24" "6rem"
   "32" "8rem"
   "40" "10rem"
   "48" "12rem"
   "56" "14rem"
   "64" "16rem"})

(def background-color colors)

(def background-position
  {"bottom"       "bottom"
   "center"       "center"
   "left"         "left"
   "left-bottom"  "left bottom"
   "left-top"     "left top"
   "right"        "right"
   "right-bottom" "right bottom"
   "right-top"    "right top"
   "top"          "top"})

(def background-size {"auto" "auto" "cover" "cover" "contain" "contain"})

(def border-color
  (assoc colors "default" (get-in colors ["gray" "300"] "currentColor")))

(def border-radius
  {"none"    "0"
   "sm"      "0.125rem"
   "default" "0.25rem"
   "lg"      "0.5rem"
   "full"    "9999px"})

(def border-width
  {"0"       "0"
   "2"       "2px"
   "4"       "4px"
   "8"       "8px"
   "default" "1px"})

(def box-shadow
  {"default" "0 1px 3px 0 rgba(0, 0, 0, 0.1), 0 1px 2px 0 rgba(0, 0, 0, 0.06)"
   "md"      "0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06)"
   "lg"      "0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05)"
   "xl"      "0 20px 25px -5px rgba(0, 0, 0, 0.1), 0 10px 10px -5px rgba(0, 0, 0, 0.04)"
   "2xl"     "0 25px 50px -12px rgba(0, 0, 0, 0.25)"
   "inner"   "inset 0 2px 4px 0 rgba(0, 0, 0, 0.06)"
   "outline" "0 0 0 3px rgba(66, 153, 225, 0.5)"
   "none"    "none"})

(def container {})

(def cursor
  {"auto"        "auto"
   "default"     "default"
   "pointer"     "pointer"
   "wait"        "wait"
   "text"        "text"
   "move"        "move"
   "not-allowed" "not-allowed"})

(def fill {"current" "currentColor"})

(def flex
  {"1"       "1 1 0%"
   "auto"    "1 1 auto"
   "initial" "0 1 auto"
   "none"    "none"})

(def flex-grow {"0" "0" "default" "1"})
(def flex-shrink {"0" "0" "default" "1"})

(def font-family
  {"sans"  ["-apple-system" "BlinkMacSystemFont" "\"Segoe UI\"" "Roboto"
            "\"Helvetica Neue\"" "Arial" "\"Noto Sans\"" "sans-serif"
            "\"Apple Color Emoji\"" "\"Segoe UI Emoji\""
            "\"Segoe UI Symbol\"" "\"Noto Color Emoji\""]
   "serif" ["Georgia" "Cambria" "\"Times New Roman\"" "Times" "serif"]
   "mono"  ["Menlo" "Monaco" "Consolas" "\"Liberation Mono\""
            "\"Courier New\"" "monospace"]})

(def font-size
  {"xs"   "0.75rem"
   "sm"   "0.875rem"
   "base" "1rem"
   "lg"   "1.125rem"
   "xl"   "1.25rem"
   "2xl"  "1.5rem"
   "3xl"  "1.875rem"
   "4xl"  "2.25rem"
   "5xl"  "3rem"
   "6xl"  "4rem"})


(def font-weight
  {"hairline"  "100"
   "thin"      "200"
   "light"     "300"
   "normal"    "400"
   "medium"    "500"
   "semibold"  "600"
   "bold"      "700"
   "extrabold" "800"
   "black"     "900"})

(def height
  (assoc spacing
    "auto" "auto"
    "full" "100%"
    "screen" "100vh"))

(def inset {"0" "0" "auto" "auto"})

(def letter-spacing
  {"tighter" "-0.05em"
   "tight"   "-0.025em"
   "normal"  "0"
   "wide"    "0.025em"
   "wider"   "0.05em"
   "widest"  "0.1em"})

(def line-height
  {"none"    "1"
   "tight"   "1.25"
   "snug"    "1.375"
   "normal"  "1.5"
   "relaxed" "1.625"
   "loose"   "2"})

(def list-style-type {"none" "none" "disc" "disc" "decimal" "decimal"})

(defn with-negatives [m]
  (reduce-kv #(assoc %1 (str "-" %2) (str "-" %3)) m m))

(def margin (assoc (with-negatives spacing) "auto" "auto"))

(def max-height {"full" "100%" "screen" "100vh"})

(def max-width
  {"xs"   "20rem"
   "sm"   "24rem"
   "md"   "28rem"
   "lg"   "32rem"
   "xl"   "36rem"
   "2xl"  "42rem"
   "3xl"  "48rem"
   "4xl"  "56rem"
   "5xl"  "64rem"
   "6xl"  "72rem"
   "full" "100%"})

(def min-height {"0" "0" "full" "100%" "screen" "100vh"})

(def min-width {"0" "0" "full" "100%"})

(def object-position
  {"right"        "right"
   "top"          "top"
   "left-top"     "left top"
   "center"       "center"
   "right-bottom" "right bottom"
   "right-top"    "right top"
   "left-bottom"  "left bottom"
   "bottom"       "bottom"
   "left"         "left"})

(def opacity {"0" "0" "25" "0.25" "50" "0.5" "75" "0.75" "100" "1"})

(def order
  {"first" "-9999"
   "none"  "0"
   "1"     "1"
   "2"     "2"
   "3"     "3"
   "4"     "4"
   "5"     "5"
   "6"     "6"
   "7"     "7"
   "8"     "8"
   "9"     "9"
   "10"    "10"
   "11"    "11"
   "12"    "12"
   "last"  "9999"})

(def padding spacing)

(def text-color colors)

(def width
  (merge
    spacing
    {"1/2"    "50%"
     "1/3"    "33.33333%"
     "2/3"    "66.66667%"
     "1/4"    "25%"
     "2/4"    "50%"
     "3/4"    "75%"
     "1/5"    "20%"
     "2/5"    "40%"
     "3/5"    "60%"
     "4/5"    "80%"
     "1/6"    "16.66667%"
     "2/6"    "33.33333%"
     "3/6"    "50%"
     "4/6"    "66.66667%"
     "5/6"    "83.33333%"
     "1/12"   "8.33333%"
     "2/12"   "16.66667%"
     "3/12"   "25%"
     "4/12"   "33.33333%"
     "5/12"   "41.66667%"
     "6/12"   "50%"
     "7/12"   "58.33333%"
     "8/12"   "66.66667%"
     "9/12"   "75%"
     "10/12"  "83.33333%"
     "11/12"  "91.66667%"
     "auto"   "auto"
     "full"   "100%"
     "screen" "100vw"}))

(def z-index
  {"auto" "auto"
   "0"    "0"
   "10"   "10"
   "20"   "20"
   "30"   "30"
   "40"   "40"
   "50"   "50"})

(def default
  {"screens"          screens
   "colors"           colors
   "spacing"          spacing
   "background-color" background-color
   "background-size"  background-size
   "border-color"     border-color
   "border-radius"    border-radius
   "border-width"     border-width
   "box-shadow"       box-shadow
   "container"        container
   "cursor"           cursor
   "fill"             fill
   "flex"             flex
   "flex-grow"        flex-grow
   "flex-shrink"      flex-shrink
   "font-family"      font-family
   "font-size"        font-size
   "font-weight"      font-weight
   "height"           height
   "inset"            inset
   "letter-spacing"   letter-spacing
   "line-height"      line-height
   "list-style-type"  list-style-type
   "margin"           margin
   "max-height"       max-height
   "max-width"        max-width
   "min-height"       min-height
   "min-width"        min-width
   "object-position"  object-position
   "opacity"          opacity
   "order"            order
   "padding"          padding
   "text-color"       text-color
   "width"            width
   "z-index"          z-index})