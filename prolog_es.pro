:- pce_begin_class([<Meta>:]<Class>[({<TermName>})], <Super>[, <Summary>]).
:- use_class_template(<TemplateClass>).
:- send(@class, <Selector>{, <Arg>}).
:- pce_class_directive(<Goal>).

variable(<Name>, <Type>[:= <Value>], <Access> [, <Summary>]).

delegate_to(<VarName>).

class_variable(<Name>, <Type>, <Default> [, <Summary>]).

handle(<X>, <Y>, <Kind>, <Name>).

:- pce_group(<Group>).

<SendSelector>(<Receiver>{, <Arg>[:[<AName>=]<Type>]}) :->
[<Summary>::]
<PrologBody>.

<GetSelector>(<Receiver>{, <Arg>[:[<AName>=]<Type>]}, <RVal>[:<Type>]) :<-
[<Summary>::]
<PrologBody>.

:- pce_end_class.