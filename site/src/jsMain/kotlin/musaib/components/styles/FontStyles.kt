package musaib.components.styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint


val SkillTextStyle = CssStyle{


    Breakpoint.ZERO {

        Modifier.fontSize(FontSize.Small)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Small)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.XL {
        Modifier.fontSize(FontSize.XLarge)
    }


}

val SkillProficiencyTextStyle = CssStyle {

    Breakpoint.ZERO {

        Modifier.fontSize(FontSize.Small)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Small)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Medium)
    }
    Breakpoint.XL {
        Modifier.fontSize(FontSize.Medium)
    }
}

