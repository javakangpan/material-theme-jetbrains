<div align="center">
  <a href="https://www.material-theme.com">
<img src="logo.svg" width="320" height="320" alt="logo"></img>
</a>
</div>

# Material Theme UI for Jetbrains

This is a port of the famous [Material Theme](https://github.com/equinusocio/vsc-material-theme) for Jetbrains IDEs, allowing a total customization of the IDE including Themes, Color Schemes, Icons and many other features.

[![GitHub issues](https://img.shields.io/github/issues/ChrisRM/material-theme-jetbrains.svg)](https://github.com/ChrisRM/material-theme-jetbrains/issues) [![GitHub stars](https://img.shields.io/github/stars/ChrisRM/material-theme-jetbrains.svg)](https://github.com/ChrisRM/material-theme-jetbrains/stargazers)
[![Twitter](https://img.shields.io/twitter/url/https/github.com/ChrisRM/material-theme-jetbrains.svg?style=social)](https://twitter.com/intent/tweet?text=Wow:&url=https%3A%2F%2Fgithub.com%2FChrisRM%2Fmaterial-theme-jetbrains)


![GitHub tag](https://img.shields.io/github/tag/ChrisRM/material-theme-jetbrains.svg)
![JetBrains IntelliJ Plugins](https://img.shields.io/jetbrains/plugin/v/8006-material-theme-ui.svg)


![Github All Releases](https://img.shields.io/github/downloads/ChrisRM/material-theme-jetbrains/total.svg)
![JetBrains IntelliJ plugins](https://img.shields.io/jetbrains/plugin/d/8006-material-theme-ui.svg?label=plugin%20downloads)


Plugin page:
https://plugins.jetbrains.com/plugin/8006-material-theme-ui

## Documentation:
https://www.material-theme.com

![laptop-full](laptop-full.png)

#### Donate via Paypal:

_@ChrisRM_:
[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=LSF7K29JBPMWU&lc=US&item_name=Material%20Theme%20JetBrains%20Development&item_number=m1&currency_code=NOK&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted)

_@Mallowigi_:
[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.me/mallowigi)

#### OpenCollective Backers

<img src="https://opencollective.com/material-theme-jetbrains/tiers/backer/badge.svg?label=Backers&color=brightgreen" />

<object type="image/svg+xml" data="https://opencollective.com/material-theme-jetbrains/tiers/backer.svg?avatarHeight=36&width=600"></object>

[![Sponsors on Open Collective](https://opencollective.com/material-theme-jetbrains/sponsors/badge.svg)](#sponsors)

#### Sponsors

The Material Theme plugin is sponsored by [CodeStream](https://codestream.com/?utm_source=jbmarket&utm_medium=banner&utm_campaign=jbmaterialtheme).

[![https://codestream.com](https://alt-images.codestream.com/codestream_logo_jbmaterialtheme.png)](https://codestream.com/?utm_source=jbmarket&utm_medium=banner&utm_campaign=jbmaterialtheme)

Discuss, review, and share code with your team in your JetBrains IDE. Integrates with Slack, Jira, Trello, Github and more. [Try it free](https://codestream.com/?utm_source=jbmarket&utm_medium=banner&utm_campaign=jbmaterialtheme)!

## Plugin
* [Support](#supported-ides)
* [Installation and Configuration](#installation)
	* [Switch Theme](#switching-the-ide-theme)
	* [Switch Color Scheme](#set-color-scheme-code)
	* [Custom Accents](#custom-accents)
* [Configuration](#configuration)
* [Development](#development)
* [Contribution](#contribution)
* [Known Issues](#known-issues)
* [Authors](#authors)
* [Contact](#contact)
* [Icon Reference](#icon-reference)
* [Color Palette](#color-palette)

## Supported IDEs

Thanks to the awesome guys at [JetBrains](https://www.jetbrains.com/) the plugin is now supported on pretty much all IDE, however there might be some issues on Rider since it's a different SDK. Android Studio is partly supported.

* IDEs versions 2016.X and lower > up until version 0.2.3
* IDEs versions 2017.1-2 > up until version 0.10.6
* IDEs versions 2017.3 > Up until version 1.6.0.4
* IDEs versions 2018.1 > Version 2.4.0-2018.1 and above
* IDEs versions 2018.2 > Version 2.4.0-2018.2 and above
* IDEs versions 2018.3 up to 2018.4 > Version 2.10.0 up to 3.0.0-rc4
* IDEs versions 2018.3.4 up to 2019.1 > Versions 3.0.0 up to 3.5.1
* IDEs versions 2019.1 up to 2019.2 > Versions 3.5.1 up to 4.0
* IDEs versions 2019.2+ > Versions from 4.0 up to 4.1

* Android Studio 2.2.3 > up until version 0.2.3
* Android Studio 3.0.0 up to 3.5.0 > All versions from 2.10

Please note that Android Studio and Rider are treated differently as they are managed by other teams that the ones from the main IDEs, so some features might not be available in those.

## Installation

1. [Open the Settings/Preferences dialog](https://www.jetbrains.com/idea/help/accessing-settings.html#openIdeSettings) (OSX/Unix: <kbd>⌘ + ,</kbd>, Windows: <kbd>Ctrl + Alt + S</kbd>)
2. In the left-hand pane, select **Plugins** (or in the new plugins page, select *Marketplace*)
3. Click **Browse repositories...** and search for `Material Theme UI` (or in the new plugins page, search for `Material Theme UI`)
4. Click **Install plugin** and confirm your intention to download and install the plugin.
5. Click **OK** in the **Settings** dialog and restart for the changes to take effect.

Note: This is not installing a new Look And Feel, instead, it is **overwriting** the Darcula theme.
Therefore, when you switch to another LAF and select back *Darcula*, you will revert to the original Darcula LAF. 
Just select a theme using the `Material Theme Switcher` to retrieve the theme back.

--------------------

### Switching the IDE theme

There are many ways to change the Material Theme Look and Feel of the IDE:
- From the IDE menu: `Tools -> Material Theme`
- From the main toolbar, there is an icon like a blue dot.
- From the `Search Everything`, look for `Material`
- From the `Quick Switch` panel <kbd>Ctrl+\`</kbd> (Windows: <kbd>Ctrl + ~</kbd>)
- From the Material Theme Settings directly

There are currently 5 bundled Material themes:
- **Oceanic Theme** - A nice Oceanic Blue like theme
- **Darker Theme** - A more classic Dark Theme
- **Lighter Theme** - A light variation of the theme
- **Palenight Theme** - A more purplish theme
- **Deep Ocean Theme** - A deep sea black theme

And 8 other bundled themes
- **Monokai Pro Theme**
- **Dracula Theme**
- **Github Theme**
- **Arc Dark Theme**
- **Atom One Dark Theme**
- **Atom One Light Theme**
- **Solarized Dark**
- **Solarized Light**

Besides, the plugin offers an endpoint allowing plugin developers to develop their own themes, just like color schemes.

You can look at the [Night Owl](https://github.com/xdrop/night-owl-jetbrains) porting using the Material Theme API while adding its own lot of options :)

--------------------


### Set color scheme (code)
On the first install, this plugin will not set the new color scheme for you, as that would cause a couple problems. You need to set the new color scheme manually:

1. Open the **Settings/Preferences** dialog again.
2. In the left-hand pane, select **Editor** -> **Colors & Fonts**.
3. In the **Scheme** dropdown, you'll find new schemes:
   1. `Material Oceanic`
   2. `Material Darker`
   3. `Material Palenight`
   4. `Material Lighter`
   5. `Material Deep Ocean`
   6. `Monokai Pro`
   7. `Dracula`
   8. `Github`
   9. `Arc Dark`
   10. `Atom One Dark`
   11. `Atom One Light`
   12. `Solarized Dark`
   13. `Solarized Light`
4. Choose the scheme you like and hit **Apply** and **OK**.

Shortcut: <kbd>Ctrl+\`</kbd> (Windows: <kbd>Ctrl + ~</kbd>) then hit `1. Color scheme` and select your desired color scheme. 

**Important!**

This plugin is coming with these bundled color schemes, the same way that IntelliJ comes with predefined color schemes such as Darcula, Solarized, Monokai and such. 
Therefore whenever you change one of their values to suit your needs the IDE will be creating a copy of the bundled scheme, and it will appear **blued** in the select box. 

That also means that subsequent updates of the plugin's color schemes will __not__ be reflected to your copies. In order to receive them, you will need to reset your changes:

1. Go to **Colors and Fonts**. At the right of your selected color scheme there is a gear icon.
2. Click on the gear and choose *Restore defaults*.

Of course you will lose all your changes, so if you need to reflect them back after resetting, create a copy first and go change by change.

**Note:** Sometimes resetting the defaults will not work... In this case you will have to manually delete your copy:
https://intellij-support.jetbrains.com/hc/en-us/articles/206544519-Directories-used-by-the-IDE-to-store-settings-caches-plugins-and-logs

Then delete the *"@_user_Material Theme"* icls files.

--------------------

### Custom Themes

Since version 0.10.0 it is now possible to customize the Material Theme's theme colors to your own desires. 
You can find the options under **Appearance** -> **Material Custom Theme**. 
There you can find the different colors used and customize them to whatever suits your needs. Let your creative desires bloom!

In order to select your custom theme, you will need to select the theme inside the *Material Theme Chooser*, called *Custom Theme*.

A light variant is also available.

**Update**: From version 3.8.0 a feature has been added allowing you to import and export your custom themes as **External Themes** (see below). 
You can finally share your creations with the world or build custom themes using the External Themes API.

--------------------

### External Themes

Since version 2.0 an option for external plugins to import their own themes to the Material Theme plugin has been added.

You should also see the [Night Owl](https://github.com/xdrop/night-owl-jetbrains) porting using the Material Theme API while adding its own lot of options :)

Be creative and develop your own themes!

### Material Status File Colors

Since the latest releases Jetbrains removed the *File Status colors* from the Color Schemes and set it inside **Version Control** -> **File Status Colors**. 
However doing so removed the customizability of the file status colors from the custom color schemes. This feature brings it back.

You can find the settings to set the file colors under **Colors and Fonts** -> **Material File Colors**. 
Of course, this is *per color scheme*, not *per theme*, so please take this into consideration.

**Note**: This feature conflicts with the **File Status Colors** IDE feature. 
Therefore it is highly preferable to use the **Material File Colors** for all file colors based customizations. 
If you prefer to use IDE's settings instead, be aware that bugs could occur that I didn't take into consideration.

**Note 2**: This feature is modifying the IDE, meaning that removing/disabling the feature will keep these colors in place even after restarting the IDE. 
For a complete cleanup, you will need to delete the **@_user_Darcula.icls** file from inside the colors settings directory.

https://intellij-support.jetbrains.com/hc/en-us/articles/206544519-Directories-used-by-the-IDE-to-store-settings-caches-plugins-and-logs

Then delete the *"@_user_Darcula"* icls files.

--------------------

### Custom Accents

From version 0.7.0 the plugin can now have different accent colors! To change the Accent Color, just press on the *Accents* Action Button on the Toolbar/Quick Switch/Tools,
then select the desired accent color.

The Accent Color is changing:
- Active Tab Highlight Color (unless the custom tab highlight color is checked)
- Open folder icon
- Tool window icons hover color
- Modified file color
- Sliders
- Branches in VCS Log
- Progress Bar, Active Input, Selected checkbox, Selected Radio Button
- Edited and Pinned file indicators
- Fold/Unfold icons
- Documentation links and bold texts
- Pressed Action Button Toggle state
- Autocomplete
- Quick info
- Caret color
- Scrollbars (when the accent scrollbars is checked)
- Modified settings indicator
- Switches in Search Everything
- Navigation Bar selected items
- etc...


--------------------

## Configuration

You can customize some plugin features in a Settings Panel under **Settings** -> **Appearance** -> **Material Theme**:

More info at https://www.material-theme.com/docs/configuration/settings/

--------------------

## Development

### Requirements

* JDK 1.8
* IntelliJ IDEA with Gradle

### Developing using IntelliJ Gradle

You can simplify development process thanks to Intellij's **Gradle plugin**. 
Install the plugin, restart the IDE and you will be prompted with a window asking if you want to import the project as a Gradle project. 
After that IntelliJ will download the Gradle Wrapper and the tasks will appear in the Gradle Tool Panel on the right.

Import the project from the `build.gradle` file and develop as normal.  Make sure you select JDK 8 in the import wizard.  
The other defaults are fine.  You can run the above mentioned CLI Gradle tasks directly in the "Gradle" Tool Window, 
which expands from the right side of the screen.  To debug, find "runIde" in the list, right-click it, and choose Run/Debug.

--------------------

## Contribution

Pull requests are appreciated! I can use some help on bugs and features listed in 
https://github.com/ChrisRM/material-theme-jetbrains/issues, or you can send me some new ideas!

--------------------

## Known Issues

### Scrambled fonts

Some users have been experiencing issues with the IDE after installing the plugin, specifically that their texts are scrambled. 
This is a known weird bug of which I have no idea of why it occurs or how to solve it. 
It could be because the JDK caches fonts or because there are conflicts between Roboto fonts, or that you have a bad version of Roboto.

Try to reinstall the Roboto font and restart the computer. If it still doesn’t work, just disable the option or select another font in the settings `(Appearance > Override Fonts)`

### Color Schemes copy

As stated in the Color Schemes section, whenever you change an attribute of the default color schemes a copy will be
created, and from then on you won't be able to receive updates to the color schemes. However, in some occasions, especially when using
third party plugins, the color schemes will be altered without your input, resulting in the aforementioned effect.

For instance, the _Markdown Navigator_ plugin creates a lot of properties when selecting a scheme, and even selecting `Restore Defaults` will still result to creating a copy.

### Dark Title Bar on Windows

The "Dark title bar" option is actually modifying the title bar color in the **whole operating system** in Windows. Since there is
currently no way to do it per-application, this setting will modify the OS itself.

If you checked it and saved and want to change the color back, follow the instructions at https://www.howtogeek
.com/225893/how-to-personalize-windows-10s-appearance/ .

### File Colors stuck after uninstallation

The File Status Colors feature is also a feature that sticks outside of the realm of the plugin as it modifies the IDE itself. Therefore
when uninstalling/disabling the plugin the colors will stuck.

If you want to reset to the default colors, open the Settings at `Version Control -> File Status Colors`  in 2017.3+. In previous
versions, you will need to go to the config directory and delete the `_@user_Darcula.icls` color scheme manually.

--------------------

# Authors:
 
Twitter: [@crmag](https://twitter.com/crmag)
[@mallowigi](https://twitter.com/mallowigi)

Official page: [@MJetbrains](https://twitter.com/MJetbrains)

Github: [@ChrisRM](https://github.com/chrisrm) [@Mallowigi](https://github.com/mallowigi)

Blog: http://www.material-theme.com/docs/blog/

**Thanks to [@equinusocio](https://github.com/equinusocio) and his original [Material Theme](https://github.com/equinusocio/vsc-material-theme) for the inspiration.**

# Contact
You can contact us or ask questions via [Gitter](https://gitter.im/Material-Theme-Jetbrains/Lobby#) or our brand new
[Slack community!](https://join.slack.com/t/material-theme-ui/shared_invite/enQtMzgzNTUxMjQ2MTQ1LWU3Y2ZlYTBlNDEyZmU5YTMzNjAxZjc0NmVkMTk1NzdmNDI1NDAwMzI4NWYxZjVmYzUyYTgwZWEzNjE2YTg2NTA)

Come say hello!

## Other portings

The Material Theme has been ported to many other editors, applications, websites and other platforms:
- [Visual Studio Code](https://github.com/equinusocio/vsc-material-theme/) (by [@equinusocio](https://github.com/equinusocio)
- [Sublime Text](https://github.com/equinusocio/material-theme/) (also by [@equinusocio](https://github.com/equinusocio)
- [Hyper](https://github.com/equinusocio/hyper-material-theme) (also by [@equinusocio](https://github.com/equinusocio).
- [Atom](https://github.com/silvestreh/atom-material-ui) (by [@silvestreh](https://github.com/silvestreh))
- [Vim](https://github.com/kristijanhusak/vim-hybrid-material) (by [@kristijanhusak](https://github.com/kristijanhusak)).
- [Terminal OSX](https://gist.github.com/mvaneijgen/4c56701215847dd5ddcf) (by [@mvaneijgen](https://github.com/mvaneijgen)).
- [iTerm2](https://gist.github.com/Revod/3f3115f8d4b90fc986fd4b61441c2567) (by [@Revod](https://github.com/Revod)) and [iTerm2 Palenight](https://github.com/JonathanSpeek/palenight-iterm2) (by [@jonathanspeek](https://github.com/jonathanspeek)).
- [ConEmu](https://gist.github.com/rajadain/b306b2ba71bd58a1df41) (by [@rajadain](https://github.com/rajadain)).
- [Slack](https://slack.com/) (`#263238`, `#2E3A40`, `#80CBC4`, `#FFFFFF`, `#13191C`, `#FFFFFF`, `#50FA7B`, `#FF5555`)
- [Nylas N1](https://github.com/jackiehluo/n1-material) (thanks to [@jackiehluo](https://github.com/jackiehluo))
- [Base16](https://github.com/ntpeters/base16-materialtheme-scheme) (by [@ntpeters](https://github.com/ntpeters))
- [Notepad++](https://github.com/Codextor/npp-material-theme) (by [@Codextor](https://github.com/Codextor))
- [Chrome Devtools](https://chrome.google.com/webstore/detail/material-theme-ui-for-dev/ejjjgkmkicngofngkjdcahlhnmmoicim)
- [Bear](https://github.com/r3volution11/material-theme-bear-notes) (by [Doug C. Hardester](https://github.com/r3volution11))

## Icon Reference

- All file icons have been built using the tools provided by [A File Icon](https://github.com/SublimeText/AFileIcon). Great thanks to them!
- And of course many thanks to the SVG creators:
* [**File-Icons**](https://github.com/file-icons/source/blob/master/charmap.md) 
* [**FontAwesome 4.7.0**](http://fontawesome.io/cheatsheet/)
* [**Mfizz**](https://github.com/file-icons/MFixx/blob/master/charmap.md)
* [**Devicons**](https://github.com/file-icons/DevOpicons/blob/master/charmap.md)
* [**Octicons**](https://octicons.github.com)
* [**Material Design Icons**](https://materialdesignicons.com/)
* [**Many FlatIcons authors**](https://www.flaticon.com/)
* [**Philipp Kief**](https://github.com/PKief/vscode-material-icon-theme)

Thanks also for [@yonnyz](https://twitter.com/yonnyz) for the theme icons!

Also many thanks to other plugin developers for helping me solving A LOT of issues:
* [Nyan Progress Bar](https://plugins.jetbrains.com/plugin/8575-nyan-progress-bar)
* [Afterglow Theme](https://plugins.jetbrains.com/plugin/8066-afterglow-theme)
* [Git Toolbox](https://plugins.jetbrains.com/plugin/7499-gittoolbox)
* [Browse Word At Caret](https://plugins.jetbrains.com/plugin/201-browsewordatcaret)
* [GitIgnore](https://github.com/hsz/idea-gitignore)
* [Project Label](https://github.com/drinchev/project-label)

Thanks to all [original plugin contributors](https://github.com/ChrisRM/material-theme-jetbrains/graphs/contributors), 
[EAP contributors](https://github.com/mallowigi/material-theme-jetbrains-docs/graphs/contributors)
and a special thanks to the guys at [JetBrains](https://www.jetbrains.com/) for contributing and showing interest in the project!

## Other Projects

Check out my other projects:
- [Image Icon Plugin](https://plugins.jetbrains.com/plugin/11096-image-icon-viewer) - A previewer for small images and svgs directly in the Project View
- [Atom Material Icons](https://plugins.jetbrains.com/plugin/10044-atom-material-icons) - A mix of the Atom File Icons and the Material Icons, or if you prefer, the Icons component of this plugin :)
- [Slack One Dark Theme](https://github.com/mallowigi/slack-one-dark-theme) - A One Dark theme for Slack
- [Custom Syntax Highlighter](https://github.com/mallowigi/Custom-Syntax-Highlighter) - Proof of concept for defining custom keywords highlighting.
- [Material Theme UI for Chrome](https://chrome.google.com/webstore/detail/material-theme-ui-for-dev/ejjjgkmkicngofngkjdcahlhnmmoicim) - Porting of the Material Theme for Chrome

## Color Palette

| Color     | Default / Darker | Lighter   |
|:----------|:-----------------|:----------|
| Red       | <span style="display:inline-block; background-color: #FF5370; color: white; width: 80px; height: 40px; border-radius: 6px">#FF5370</span>        | <span style="display:inline-block; background-color: #E53935; color: white; width: 80px; height: 40px; border-radius: 6px">#E53935</span> |
| Pink      | <span style="display:inline-block; background-color: #F07178; color: white; width: 80px; height: 40px; border-radius: 6px">#F07178</span>        | <span style="display:inline-block; background-color: #FF5370; color: white; width: 80px; height: 40px; border-radius: 6px">#FF5370</span> |
| Orange    | <span style="display:inline-block; background-color: #F78C6C; color: white; width: 80px; height: 40px; border-radius: 6px">#F78C6C</span>        | <span style="display:inline-block; background-color: #F76D47; color: white; width: 80px; height: 40px; border-radius: 6px">#F76D47</span> |
| Yellow    | <span style="display:inline-block; background-color: #FFCB6B; color: white; width: 80px; height: 40px; border-radius: 6px">#FFCB6B</span>        | <span style="display:inline-block; background-color: #FFB62C; color: white; width: 80px; height: 40px; border-radius: 6px">#FFB62C</span> |
| Green     | <span style="display:inline-block; background-color: #C3E88D; color: white; width: 80px; height: 40px; border-radius: 6px">#C3E88D</span>        | <span style="display:inline-block; background-color: #91B859; color: white; width: 80px; height: 40px; border-radius: 6px">#91B859</span> |
| Pale Blue | <span style="display:inline-block; background-color: #B2CCD6; color: white; width: 80px; height: 40px; border-radius: 6px">#B2CCD6</span>        | <span style="display:inline-block; background-color: #8796B0; color: white; width: 80px; height: 40px; border-radius: 6px">#8796B0</span> |
| Cyan      | <span style="display:inline-block; background-color: #89DDFF; color: white; width: 80px; height: 40px; border-radius: 6px">#89DDFF</span>        | <span style="display:inline-block; background-color: #39ADB5; color: white; width: 80px; height: 40px; border-radius: 6px">#39ADB5</span> |
| Blue      | <span style="display:inline-block; background-color: #82AAFF; color: white; width: 80px; height: 40px; border-radius: 6px">#82AAFF</span>        | <span style="display:inline-block; background-color: #6182B8; color: white; width: 80px; height: 40px; border-radius: 6px">#6182B8</span> |
| Purple    | <span style="display:inline-block; background-color: #C792EA; color: white; width: 80px; height: 40px; border-radius: 6px">#C792EA</span>        | <span style="display:inline-block; background-color: #7C4DFF; color: white; width: 80px; height: 40px; border-radius: 6px">#7C4DFF</span> |
| Violet    | <span style="display:inline-block; background-color: #BB80B3; color: white; width: 80px; height: 40px; border-radius: 6px">#BB80B3</span>        | <span style="display:inline-block; background-color: #945EB8; color: white; width: 80px; height: 40px; border-radius: 6px">#945EB8</span> |
| Brown     | <span style="display:inline-block; background-color: #AB7967; color: white; width: 80px; height: 40px; border-radius: 6px">#AB7967</span>        | <span style="display:inline-block; background-color: #AB7967; color: white; width: 80px; height: 40px; border-radius: 6px">#AB7967</span> |


**Color Theme Reference**

| Color                | Default  | Darker   | Lighter  | Palenight|
| -------------------- | --------- | --------- | --------- | --------- |
| Background           | <span style="display:inline-block; background-color: #263238; color: white; width: 80px; height: 40px; border-radius: 6px">#263238</span> | <span style="display:inline-block; background-color: #212121; color: white; width: 80px; height: 40px; border-radius: 6px">#212121</span> | <span style="display:inline-block; background-color: #FAFAFA; color: white; width: 80px; height: 40px; border-radius: 6px">#FAFAFA</span> | <span style="display:inline-block; background-color: #292D3E; color: white; width: 80px; height: 40px; border-radius: 6px">#292D3E</span> |
| Foreground           | <span style="display:inline-block; background-color: #B0BEC5; color: white; width: 80px; height: 40px; border-radius: 6px">#B0BEC5</span> | <span style="display:inline-block; background-color: #B0BEC5; color: white; width: 80px; height: 40px; border-radius: 6px">#B0BEC5</span> | <span style="display:inline-block; background-color: #A7ADB0; color: white; width: 80px; height: 40px; border-radius: 6px">#A7ADB0</span> | <span style="display:inline-block; background-color: #B0BEC5; color: white; width: 80px; height: 40px; border-radius: 6px">#B0BEC5</span> |
| Selection            | <span style="display:inline-block; background-color: #546E7A; color: white; width: 80px; height: 40px; border-radius: 6px">#546E7A</span> | <span style="display:inline-block; background-color: #424242; color: white; width: 80px; height: 40px; border-radius: 6px">#424242</span> | <span style="display:inline-block; background-color: #546E7A; color: white; width: 80px; height: 40px; border-radius: 6px">#546E7A</span> | <span style="display:inline-block; background-color: #676E95; color: white; width: 80px; height: 40px; border-radius: 6px">#676E95</span> |
| Primary Color        | <span style="display:inline-block; background-color: #607D8B; color: white; width: 80px; height: 40px; border-radius: 6px">#607D8B</span> | <span style="display:inline-block; background-color: #616161; color: white; width: 80px; height: 40px; border-radius: 6px">#616161</span> | <span style="display:inline-block; background-color: #A7ADB0; color: white; width: 80px; height: 40px; border-radius: 6px">#A7ADB0</span> | <span style="display:inline-block; background-color: #A6ACCD; color: white; width: 80px; height: 40px; border-radius: 6px">#A6ACCD</span> |
| Alternative Color    | <span style="display:inline-block; background-color: #546E7A; color: white; width: 80px; height: 40px; border-radius: 6px">#546E7A</span> | <span style="display:inline-block; background-color: #616161; color: white; width: 80px; height: 40px; border-radius: 6px">#616161</span> | <span style="display:inline-block; background-color: #B0BEC5; color: white; width: 80px; height: 40px; border-radius: 6px">#B0BEC5</span> | <span style="display:inline-block; background-color: #676E95; color: white; width: 80px; height: 40px; border-radius: 6px">#676E95</span> |
| Inactive             | <span style="display:inline-block; background-color: #415967; color: white; width: 80px; height: 40px; border-radius: 6px">#415967</span> | <span style="display:inline-block; background-color: #474747; color: white; width: 80px; height: 40px; border-radius: 6px">#474747</span> | <span style="display:inline-block; background-color: #D2D4D5; color: white; width: 80px; height: 40px; border-radius: 6px">#D2D4D5</span> | <span style="display:inline-block; background-color: #4E5579; color: white; width: 80px; height: 40px; border-radius: 6px">#4E5579</span> |

**Accent Colors**

| Accent       | Color     |
|:-------------|:----------|
| Turquoise    | <span style="display:inline-block; background-color: #80CBC4; color: white; width: 80px; height: 40px; border-radius: 6px">#80CBC4</span> |
| Acid Lime    | <span style="display:inline-block; background-color: #C6FF00; color: white; width: 80px; height: 40px; border-radius: 6px">#C6FF00</span> |
| Amethyst     | <span style="display:inline-block; background-color: #AB47BC; color: white; width: 80px; height: 40px; border-radius: 6px">#AB47BC</span> |
| Aquamarine   | <span style="display:inline-block; background-color: #64FFDA; color: white; width: 80px; height: 40px; border-radius: 6px">#64FFDA</span> |
| Breaking Bad | <span style="display:inline-block; background-color: #388E3C; color: white; width: 80px; height: 40px; border-radius: 6px">#388E3C</span> |
| Brick        | <span style="display:inline-block; background-color: #E57373; color: white; width: 80px; height: 40px; border-radius: 6px">#E57373</span> |
| Coffee       | <span style="display:inline-block; background-color: #795548; color: white; width: 80px; height: 40px; border-radius: 6px">#795548</span> |
| Cyan         | <span style="display:inline-block; background-color: #00BCD4; color: white; width: 80px; height: 40px; border-radius: 6px">#00BCD4</span> |
| Daisy        | <span style="display:inline-block; background-color: #FFEB3B; color: white; width: 80px; height: 40px; border-radius: 6px">#FFEB3B</span> |
| Dodger Blue  | <span style="display:inline-block; background-color: #2979FF; color: white; width: 80px; height: 40px; border-radius: 6px">#2979FF</span> |
| Fuschia      | <span style="display:inline-block; background-color: #E91E63; color: white; width: 80px; height: 40px; border-radius: 6px">#E91E63</span> |
| Gold         | <span style="display:inline-block; background-color: #FFD700; color: white; width: 80px; height: 40px; border-radius: 6px">#FFD700</span> |
| Graphite     | <span style="display:inline-block; background-color: #616161; color: white; width: 80px; height: 40px; border-radius: 6px">#616161</span> |
| Indigo       | <span style="display:inline-block; background-color: #3F51B5; color: white; width: 80px; height: 40px; border-radius: 6px">#3F51B5</span> |
| Lime         | <span style="display:inline-block; background-color: #7CB342; color: white; width: 80px; height: 40px; border-radius: 6px">#7CB342</span> |
| Orange       | <span style="display:inline-block; background-color: #FF7042; color: white; width: 80px; height: 40px; border-radius: 6px">#FF7042</span> |
| Pomegrenate  | <span style="display:inline-block; background-color: #F44336; color: white; width: 80px; height: 40px; border-radius: 6px">#F44336</span> |
| Sky          | <span style="display:inline-block; background-color: #84FFFF; color: white; width: 80px; height: 40px; border-radius: 6px">#84FFFF</span> |
| Slate        | <span style="display:inline-block; background-color: #607D8B; color: white; width: 80px; height: 40px; border-radius: 6px">#607D8B</span> |
| Strawberry   | <span style="display:inline-block; background-color: #FF4081; color: white; width: 80px; height: 40px; border-radius: 6px">#FF4081</span> |
| Teal         | <span style="display:inline-block; background-color: #009688; color: white; width: 80px; height: 40px; border-radius: 6px">#009688</span> |
| Tomato       | <span style="display:inline-block; background-color: #F44336; color: white; width: 80px; height: 40px; border-radius: 6px">#F44336</span> |

## Contributors

This project exists thanks to all the people who contribute. 
<a href="graphs/contributors"><img src="https://opencollective.com/material-theme-jetbrains/contributors.svg?width=890&button=false" /></a>


## Backers

Thank you to all our backers! 🙏 [[Become a backer](https://opencollective.com/material-theme-jetbrains#backer)]

<a href="https://opencollective.com/material-theme-jetbrains#backers" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/backers.svg?width=890"></a>

Check also : http://www.material-theme.com/docs/support-us/

## Sponsors

Support this project by becoming a sponsor. Your logo will show up here with a link to your website. [[Become a sponsor](https://opencollective.com/material-theme-jetbrains#sponsor)]

<a href="https://opencollective.com/material-theme-jetbrains/sponsor/0/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/1/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/2/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/2/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/3/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/3/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/4/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/4/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/5/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/5/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/6/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/6/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/7/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/7/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/8/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/8/avatar.svg"></a>
<a href="https://opencollective.com/material-theme-jetbrains/sponsor/9/website" target="_blank"><img src="https://opencollective.com/material-theme-jetbrains/sponsor/9/avatar.svg"></a>


