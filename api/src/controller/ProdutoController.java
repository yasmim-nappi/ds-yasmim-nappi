package controller;
import service.ProdutoService;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    @AutoWired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
        Produto novoProduto = service.salvar(produto);
            return new ResponseEntity<>(novoProduto,HttpStatus.CREATED);
    }

    @GetMapping
    public List<Produto>listarTodos(){
        return service.listarTodos();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id,@RequestBody Produto produtoDetalhes){
        return service.buscarPorId(id).map(produtoExistente) -> {
            produtoExistente.setNome(produtoDetalhes.getNome());
            produtoExistente.setPreco(produtoDetalhes.getPreco());
            Produto produtoAtualizado = service.salvar(produtoExistente);
                return ResponseEntity.ok(produtoAtualizado);
        } .orElseGet(()-> ResponseEntity.notFound().build(();
    }

    @DeleteMapping ("/{id}")
        public ResponseEntity<Void> deletar(PathVariable Long id){
        if service.buscarPorId(id).isPresent(() {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
