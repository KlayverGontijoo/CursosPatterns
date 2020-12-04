# CursosPatterns
Trabalho desenvolvido para a matéria de Análise de desenvolvimento

Utilizamos o Composite para criarmos os cursos simples de Excel, Word e PowerPoint e depois criamos um pacote de cursos onde se encontra uma promoção quando alguém queira 
fazer os três curso de uma só vez, com o composite conseguimos tratar tanto o objeto simples quanto o objeto composto de uma mesma maneira.

Utilizamos também o Proxy, para redirecionar o cliente de acordo com o tipo de curso que ele optou, se optou por um curso grátis, ele poderá assitir mas terá anúncios durante
o decorrer do curso e não terá acesso exclusivo a materiais didáticos, se o cliente optar por um curso pago terá acesso direto ao curso sem interrupções de anúncios e acesso a
conteúdos exclusivos.

Utilizamos o Singleton para que o cliente crie um usuário, se instanciarmos um mesmo usuário ele retorna que este usuário já foi criado.

Obs: Quando fui fazer o commit especifiquei que fiz um Composite e um Decorator, mas implementei foi um Proxy.
