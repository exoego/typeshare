/**
 * Generated by typeshare 1.0.0
 */
package com.agilebits

package onepassword {

// This is a comment.
// Continued lovingly here
sealed trait Colors {
	def serialName: String
}
object Colors {
	case object Red extends Colors {
		val serialName: String = "red"
	}
	case object Blue extends Colors {
		val serialName: String = "blue"
	}
	// Green is a cool color
	case object Green extends Colors {
		val serialName: String = "green-like"
	}
}

}
