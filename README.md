

```markdown
# WaterMonitor - Sistema de Monitoramento de Água

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green)
![Oracle](https://img.shields.io/badge/Oracle-XE-red)
![Docker](https://img.shields.io/badge/Docker-✓-lightblue)
![Team](https://img.shields.io/badge/Team-4_Devs-orange)

## 🌊 Visão Geral

O WaterMonitor é um sistema avançado de monitoramento de consumo de água desenvolvido com Spring Boot 3 e Java 21. A aplicação oferece:

- Cadastro inteligente de medições hidrológicas
- Georreferenciamento de pontos de consumo
- Análise temporal de dados
- Sistema de alertas preventivos
- API RESTful segura com autenticação

## 👨‍💻 Equipe de Desenvolvimento

**Desenvolvedores:**
- Thiago Carvalho Ferrer
- Guilherme Fernandes
- Gustavo Godoy
- Pedro Dellagnese Welter

## 🛠 Stack Tecnológica

**Backend:**
- Java 21 (LTS)
- Spring Boot 3.1 (Web, Data JPA, Security)
- Hibernate Validator 8.0
- Lombok

**Banco de Dados:**
- Oracle XE 21c

**Infraestrutura:**
- Docker + Docker Compose
- Oracle DB Containerizado

## 🚀 Como Executar o Projeto

### Usando Docker Compose

```bash
docker-compose up -d --build
```

Acesse a API em:
```
http://localhost:8080/api/medicoes
```

## 🔒 Autenticação

Credenciais padrão:
- Usuário: `admin`
- Senha: `admin123`

## 📚 Documentação da API

**Endpoints Principais:**

| Método | Endpoint               | Descrição                          |
|--------|------------------------|------------------------------------|
| POST   | /api/medicoes          | Cria nova medição                  |
| GET    | /api/medicoes          | Lista todas as medições            |
| GET    | /api/medicoes/{id}     | Obtém medição por ID               |
| DELETE | /api/medicoes/{id}     | Remove medição                     |

**Modelo de Dados:**
```json
{
  "id": 1,
  "localizacao": "Setor A - Andar 3",
  "consumoLitros": 1250.50,
  "dataMedicao": "2023-11-15",
  "alerta": "consumo elevado"
}
```

## 🐛 Troubleshooting

Problemas comuns:
1. **Erro de conexão com Oracle**: Verifique se o container está ativo
2. **Autenticação falha**: Confira credentials no Postman
3. **Validação**: Todos campos são obrigatórios

## 🤝 Contribuição

1. Faça um fork
2. Crie sua branch (`git checkout -b feature/nova-funcionalidade`)
3. Commit (`git commit -m 'Add feature'`)
4. Push (`git push origin feature`)
5. Abra um PR

## 📄 Licença

MIT License - Copyright (c) 2023 WaterWatch Team

---
